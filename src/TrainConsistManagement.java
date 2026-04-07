import java.util.Arrays;

public class TrainConsistManagement {

    public static void main(String[] args) {

        // Example bogie type names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Sorting using built-in method
        Arrays.sort(bogieNames);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Additional test cases

        // Unsorted input
        String[] unsorted = {"Luxury", "General", "Sleeper", "AC Chair"};
        Arrays.sort(unsorted);
        System.out.println("Unsorted Input Sorted:");
        System.out.println(Arrays.toString(unsorted));

        // Already sorted array
        String[] sorted = {"AC Chair", "First Class", "General"};
        Arrays.sort(sorted);
        System.out.println("Already Sorted:");
        System.out.println(Arrays.toString(sorted));

        // Duplicate bogie names
        String[] duplicates = {"Sleeper", "AC Chair", "Sleeper", "General"};
        Arrays.sort(duplicates);
        System.out.println("With Duplicates:");
        System.out.println(Arrays.toString(duplicates));

        // Single element array
        String[] single = {"Sleeper"};
        Arrays.sort(single);
        System.out.println("Single Element:");
        System.out.println(Arrays.toString(single));
    }
}