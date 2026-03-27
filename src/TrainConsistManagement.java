import java.util.*;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void display() {
        System.out.println("Bogie: " + name + " | Capacity: " + capacity);
    }
}

public class TrainConsistManagement {
    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // Step 2: Stream → map → reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.getCapacity())     // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        // Step 3: Display result
        System.out.println("Total Seating Capacity of Train: " + totalCapacity);

        // Step 4: Show original list (unchanged)
        System.out.println("\nOriginal Bogie List:");
        for (Bogie b : bogies) {
            b.display();
        }
    }
}