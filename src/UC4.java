import java.util.*;

// ===================== MAIN CLASS =====================
public class UC4 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // ===================== INITIALIZE LINKEDLIST =====================
        LinkedList<String> trainConsist = new LinkedList<>();

        // ===================== ADD BOGIES =====================
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nTrain consist after adding bogies:");
        System.out.println(trainConsist);

        // ===================== INSERT PANTRY CAR AT POSITION 2 =====================
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nTrain consist after inserting Pantry Car at position 2:");
        System.out.println(trainConsist);

        // ===================== REMOVE FIRST AND LAST BOGIES =====================
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nTrain consist after removing first and last bogie:");
        System.out.println(trainConsist);

        // ===================== FINAL STATE =====================
        System.out.println("\nFinal ordered train consist:");
        for (int i = 0; i < trainConsist.size(); i++) {
            System.out.println((i + 1) + ". " + trainConsist.get(i));
        }

        System.out.println("\nSystem ready for next operations.");
    }
}