import java.util.Scanner;

public class TrainConsistManagement {

    public static boolean searchBogie(String[] bogieIds, String key) {
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in the train");
        }

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] bogieIds = {"BG101","BG205","BG309"};

        System.out.println("Enter bogie ID to search:");
        String key = sc.nextLine();

        try {
            boolean found = searchBogie(bogieIds, key);

            if (found) {
                System.out.println("Bogie ID found");
            } else {
                System.out.println("Bogie ID not found");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}