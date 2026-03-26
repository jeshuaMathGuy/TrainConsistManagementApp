import java.util.*;
import java.util.stream.*;

public class UC9{

    // Bogie class
    static class Bogie {
        String name;
        String type; // Sleeper, AC Chair, First Class
        int capacity;

        Bogie(String name, String type, int capacity) {
            this.name = name;
            this.type = type;
            this.capacity = capacity;
        }
    }

    private List<Bogie> bogieList = new ArrayList<>();

    // Add bogie
    public void addBogie(String name, String type, int capacity) {
        bogieList.add(new Bogie(name, type, capacity));
        System.out.println("✅ Bogie added.");
    }

    // Display all bogies
    public void displayBogies() {
        if (bogieList.isEmpty()) {
            System.out.println("No bogies available.");
            return;
        }

        System.out.println("\n🚆 All Bogies:");
        bogieList.forEach(b ->
                System.out.println(b.name + " | " + b.type + " | Capacity: " + b.capacity)
        );
    }

    // UC7: Sort by capacity
    public void sortByCapacity() {
        bogieList.sort((b1, b2) -> b2.capacity - b1.capacity);
        System.out.println("\n📊 Sorted by Capacity:");
        displayBogies();
    }

    // UC8: Filter by capacity
    public void filterHighCapacity(int minCapacity) {
        List<Bogie> filtered = bogieList.stream()
                .filter(b -> b.capacity >= minCapacity)
                .collect(Collectors.toList());

        if (filtered.isEmpty()) {
            System.out.println("No bogies match the criteria.");
            return;
        }

        System.out.println("\n🔍 Bogies with capacity >= " + minCapacity + ":");
        filtered.forEach(b ->
                System.out.println(b.name + " | " + b.type + " | Capacity: " + b.capacity)
        );
    }

    // 🔥 UC9: Group by Type
    public void groupByType() {
        Map<String, List<Bogie>> grouped = bogieList.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        System.out.println("\n📂 Bogies Grouped by Type:");
        grouped.forEach((type, list) -> {
            System.out.println("\nType: " + type);
            list.forEach(b ->
                    System.out.println("  " + b.name + " | Capacity: " + b.capacity)
            );
        });
    }

    // Main method
    public static void main(String[] args) {
        TrainConsistManagementApp app = new TrainConsistManagementApp();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Train Consist Management =====");
            System.out.println("1. Add Passenger Bogie");
            System.out.println("2. Display Bogies");
            System.out.println("3. Sort by Capacity");
            System.out.println("4. Filter by Capacity");
            System.out.println("5. Group by Type (UC9)");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter bogie name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter type (Sleeper / AC Chair / First Class): ");
                    String type = sc.nextLine();

                    System.out.print("Enter capacity: ");
                    int capacity = sc.nextInt();

                    app.addBogie(name, type, capacity);
                    break;

                case 2:
                    app.displayBogies();
                    break;

                case 3:
                    app.sortByCapacity();
                    break;

                case 4:
                    System.out.print("Enter minimum capacity: ");
                    int min = sc.nextInt();
                    app.filterHighCapacity(min);
                    break;

                case 5:
                    app.groupByType();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}