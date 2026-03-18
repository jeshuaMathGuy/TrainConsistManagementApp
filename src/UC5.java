import java.util.*;

// ===================== MAIN CLASS =====================
public class UC5 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // ===================== INITIALIZE LINKEDHASHSET =====================
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // ===================== ATTACH BOGIES =====================
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to attach a duplicate bogie
        trainFormation.add("Sleeper"); // Duplicate, will be ignored

        // ===================== DISPLAY TRAIN FORMATION =====================
        System.out.println("\nFinal train formation (duplicates ignored, order preserved):");
        for (String bogie : trainFormation) {
            System.out.println("- " + bogie);
        }

        System.out.println("\nTotal bogies: " + trainFormation.size());
        System.out.println("System ready for next operations.");
    }
}