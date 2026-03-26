import java.util.*;

public class UC7 {

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

    // List to store bogies
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

        System.out.println("\n🚆 Train Bogies:");
        for (Bogie b : bogieList) {
            System.out.println(b.name + " | " + b.type + " | Capacity: " + b.capacity);
        }
    }

    // 🔥 UC7: Sort using Comparator
    public void sortByCapacity() {
        bogieList.sort(new Comparator<Bogie>() {
            @Override
            public int compare(Bogie b1, Bogie b2) {
                return b2.capacity - b1.capacity; // Descending
            }
        });

        System.out.println("\n📊 Bogies sorted by capacity (High → Low):");
        displayBogies();
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
            System.out.println("4. Exit");
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
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}