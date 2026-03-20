import java.util.HashSet;

public class TrainConsistManagement{

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create a HashSet for unique bogie IDs
        HashSet<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs in the Train:");
        System.out.println(bogieIds);
    }
}