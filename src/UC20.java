import java.util.Scanner;

public class BogieIDSearchSafe {

    // Linear search method with defensive check
    public static boolean linearSearch(String[] bogieIDs, String searchKey) {
        // Defensive programming: check if array is empty
        if (bogieIDs == null || bogieIDs.length == 0) {
            throw new IllegalStateException("Search failed: No bogies are available in the train consist.");
        }

        // Perform linear search
        for (String id : bogieIDs) {
            if (id.equals(searchKey)) {
                return true; // Match found
            }
        }
        return false; // Not found
    }

    public static void main(String[] args) {
        // Example: Empty bogie array
        String[] bogieIDs = {}; // or null

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Bogie ID to search: ");
            String searchKey = scanner.nextLine();

            boolean found = linearSearch(bogieIDs, searchKey);

            if (found) {
                System.out.println("Bogie ID " + searchKey + " exists in the consist.");
            } else {
                System.out.println("Bogie ID " + searchKey + " does NOT exist in the consist.");
            }

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage()); // Fail-fast error message
        } finally {
            scanner.close();
        }
    }
}