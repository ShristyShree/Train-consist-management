import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagement {

    public static boolean binarySearch(String[] bogieIds, String key) {
        if (bogieIds.length == 0) {
            return false;
        }

        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                return true;
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] bogieIds = {"BG309","BG101","BG550","BG205","BG412"};

        System.out.println("Enter bogie ID to search:");
        String key = sc.nextLine();

        boolean found = binarySearch(bogieIds, key);

        if (found) {
            System.out.println("Bogie ID found");
        } else {
            System.out.println("Bogie ID not found");
        }

        sc.close();
    }
}