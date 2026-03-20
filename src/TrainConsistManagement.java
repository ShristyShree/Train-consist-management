import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagement{

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create a HashMap to store bogie -> capacity
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // Add bogie-capacity mappings
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 40);

        // Display capacity details
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }
    }
}