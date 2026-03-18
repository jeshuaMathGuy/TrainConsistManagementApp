import java.util.*;

// ===================== MAIN CLASS =====================
public class UC2 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize passenger bogie list
        List<String> passengerBogies = new ArrayList<>();

        // ===================== ADD BOGIES =====================
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger bogies after addition:");
        System.out.println(passengerBogies);

        // ===================== REMOVE BOGIE =====================
        passengerBogies.remove("AC Chair");

        System.out.println("\nPassenger bogies after removing AC Chair:");
        System.out.println(passengerBogies);

        // ===================== CHECK EXISTENCE =====================
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nDoes Sleeper bogie exist? " + exists);

        // ===================== FINAL STATE =====================
        System.out.println("\nFinal Passenger Bogie List:");
        System.out.println(passengerBogies);

        // Program continues...
        System.out.println("\nSystem ready for next operations.");
    }
}