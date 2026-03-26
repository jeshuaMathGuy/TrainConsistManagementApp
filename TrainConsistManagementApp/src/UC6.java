import java.util.HashMap;
import java.util.Scanner;

public class UC6{

    // HashMap to store bogie name -> capacity
    private HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

    // Method to add a bogie
    public void addBogie(String name, int capacity) {
        if (bogieCapacityMap.containsKey(name)) {
            System.out.println("❌ Bogie already exists!");
        } else {
            bogieCapacityMap.put(name, capacity);
            System.out.println("✅ Bogie added successfully.");
        }
    }

    // Method to display train consist
    public void displayTrain() {
        if (bogieCapacityMap.isEmpty()) {
            System.out.println("Train is empty.");
            return;
        }

        System.out.println("\n🚆 Train Consist:");
        for (String bogie : bogieCapacityMap.keySet()) {
            System.out.println(bogie + " → Capacity: " + bogieCapacityMap.get(bogie));
        }
    }

    // Method to calculate total capacity
    public void showTotalCapacity() {
        int total = 0;
        for (int capacity : bogieCapacityMap.values()) {
            total += capacity;
        }
        System.out.println("📊 Total Capacity: " + total);
    }

    // Main method (entry point)
    public static void main(String[] args) {
        TrainConsistManagementApp app = new TrainConsistManagementApp();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Train Consist Management =====");
            System.out.println("1. Add Bogie");
            System.out.println("2. Display Train");
            System.out.println("3. Total Capacity");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter bogie name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter capacity: ");
                    int capacity = sc.nextInt();

                    app.addBogie(name, capacity);
                    break;

                case 2:
                    app.displayTrain();
                    break;

                case 3:
                    app.showTotalCapacity();
                    break;

                case 4:
                    System.out.println("Exiting application...");
                    sc.close();
                    return;

                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
    }
}