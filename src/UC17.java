import java.util.Arrays;

public class BogieNameSort {

    public static void main(String[] args) {
        // Example array of bogie names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Sort using built-in Arrays.sort()
        Arrays.sort(bogieNames);

        System.out.println("After sorting (alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        // Additional test cases

        // Unsorted input with duplicates
        String[] bogieNames2 = {"Luxury","General","Sleeper","AC Chair","Sleeper"};
        Arrays.sort(bogieNames2);
        System.out.println("\nSorted array with duplicates:");
        System.out.println(Arrays.toString(bogieNames2));

        // Already sorted array
        String[] bogieNames3 = {"AC Chair","First Class","General"};
        Arrays.sort(bogieNames3);
        System.out.println("\nAlready sorted array:");
        System.out.println(Arrays.toString(bogieNames3));

        // Single element array
        String[] bogieNames4 = {"Sleeper"};
        Arrays.sort(bogieNames4);
        System.out.println("\nSingle-element array:");
        System.out.println(Arrays.toString(bogieNames4));
    }
}