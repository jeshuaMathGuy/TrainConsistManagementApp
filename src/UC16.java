public class UC16 {

    // Bubble Sort method
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            // Track if any swaps happen this pass
            boolean swapped = false;

            // Compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps happened, array is sorted
            if (!swapped) break;
        }
    }

    // Display array contents
    public static void displayCapacities(int[] capacities) {
        System.out.print("Passenger bogie capacities: ");
        for (int cap : capacities) {
            System.out.print(cap + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before sorting:");
        displayCapacities(capacities);

        // Perform Bubble Sort
        bubbleSort(capacities);

        System.out.println("After sorting (ascending):");
        displayCapacities(capacities);

        // Test with duplicates and single element
        int[] capacities2 = {72, 56, 56, 24};
        int[] capacities3 = {50};

        System.out.println("\nSorting array with duplicates:");
        bubbleSort(capacities2);
        displayCapacities(capacities2);

        System.out.println("\nSorting single-element array:");
        bubbleSort(capacities3);
        displayCapacities(capacities3);
    }
}