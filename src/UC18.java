import java.util.Scanner;

public class UC18
{

    // Linear search method
    public static boolean linearSearch(String[] bogieIDs, String searchKey) {
        for (String id : bogieIDs) {
            if (id.equals(searchKey)) { // Equality comparison
                return true; // Match found
            }
        }
        return false; // Not found after full traversal
    }

    public static void main(String[] args) {
        // Sample array of bogie IDs (unsorted)
        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bogie IDs in the train consist:");
        for (String id : bogieIDs) {
            System.out.print(id + " ");
        }
        System.out.println("\n");

        // Accept bogie ID to search
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        // Perform linear search
        boolean found = linearSearch(bogieIDs, searchKey);

        // Display result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " exists in the consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " does NOT exist in the consist.");
        }

        scanner.close();
    }
}