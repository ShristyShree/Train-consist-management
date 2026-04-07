import java.util.Scanner;

public class TrainConsistManagement{

    public static boolean linearSearch(String[] bogieIds, String key) {
        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(key)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"};

        System.out.println("Enter bogie ID to search:");
        String key = sc.nextLine();

        boolean found = linearSearch(bogieIds, key);

        if (found) {
            System.out.println("Bogie ID found");
        } else {
            System.out.println("Bogie ID not found");
        }

        sc.close();
    }
}