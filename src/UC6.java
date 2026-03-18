import java.util.*;

// ===================== MAIN CLASS =====================
public class UC6 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // ===================== INITIALIZE HASHMAP =====================
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // ===================== ADD BOGIE-CAPACITY PAIRS =====================
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 78);
        bogieCapacityMap.put("First Class", 54);
        bogieCapacityMap.put("Cargo", 100);  // Load capacity in tons
        bogieCapacityMap.put("Guard", 0);    // No capacity, for illustration

        // ===================== DISPLAY BOGIE CAPACITY =====================
        System.out.println("\nBogie Capacities:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            String bogie = entry.getKey();
            int capacity = entry.getValue();
            System.out.println("- " + bogie + ": " + capacity + " seats/tons");
        }

        System.out.println("\nTotal bogies: " + bogieCapacityMap.size());
        System.out.println("System ready for next operations.");
    }
}