import java.util.Arrays;
import java.util.Scanner;

public class UC19 {

    // Binary search method
    public static boolean binarySearch(String[] sortedBogieIDs, String searchKey) {
        int low = 0;
        int high = sortedBogieIDs.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = searchKey.compareTo(sortedBogieIDs[mid]);

            if (cmp == 0) {
                return true; // Found
            } else if (cmp < 0) {
                high = mid - 1; // Search left half
            } else {
                low = mid + 1; // Search right half
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sorted array of bogie IDs (precondition for binary search)
        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIDs));

        System.out.print("Enter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        boolean found = binarySearch(bogieIDs, searchKey);

        if (found) {
            System.out.println("Bogie ID " + searchKey + " exists in the consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " does NOT exist in the consist.");
        }

        scanner.close();
    }
}