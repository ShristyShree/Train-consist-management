import java.util.ArrayList;

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("\nPassenger Bogies after removal of AC Chair:");
        System.out.println(passengerBogies);

        // Check if Sleeper exists
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does not exist in the train.");
        }

        // Final list state
        System.out.println("\nFinal Passenger Bogies List:");
        System.out.println(passengerBogies);
    }
}