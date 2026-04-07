class PassengerBogieSorter {

    // Method to perform Bubble Sort
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparisons
            for (int j = 0; j < n - 1 - i; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap logic
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

    // Utility method to print array
    public static void display(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Example passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting:");
        display(capacities);

        // Perform Bubble Sort
        bubbleSort(capacities);

        System.out.println("After Sorting:");
        display(capacities);

        // Additional test cases

        // Already sorted array
        int[] sortedArray = {24, 56, 60, 70, 72};
        bubbleSort(sortedArray);
        System.out.println("Already Sorted Array:");
        display(sortedArray);

        // Duplicate values
        int[] duplicateArray = {72, 56, 56, 24};
        bubbleSort(duplicateArray);
        System.out.println("With Duplicates:");
        display(duplicateArray);

        // Single element
        int[] singleElement = {50};
        bubbleSort(singleElement);
        System.out.println("Single Element Array:");
        display(singleElement);

        // All equal values
        int[] equalValues = {40, 40, 40};
        bubbleSort(equalValues);
        System.out.println("All Equal Values:");
        display(equalValues);
    }
}