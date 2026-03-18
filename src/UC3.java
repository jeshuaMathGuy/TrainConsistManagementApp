import java.util.*;

// ===================== MAIN CLASS =====================
public class UC3 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // ===================== ADD BOGIE IDs =====================
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        // Adding duplicates intentionally
        bogieIds.add("BG101");
        bogieIds.add("BG102");

        // ===================== DISPLAY RESULT =====================
        System.out.println("\nBogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIds);

        // Program continues...
        System.out.println("\nTotal unique bogies: " + bogieIds.size());
        System.out.println("System ready for next operations.");
    }
}