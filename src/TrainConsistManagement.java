import java.util.*;
import java.util.stream.*;

class PassengerBogie {
    private String type;
    private int capacity;

    public PassengerBogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Capacity: " + capacity;
    }
}

public class TrainPerformanceApp {

    public static void main(String[] args) {

        List<PassengerBogie> bogies = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            bogies.add(new PassengerBogie("Sleeper", (int)(Math.random() * 100)));
        }

        long startLoop = System.nanoTime();

        List<PassengerBogie> loopResult = new ArrayList<>();
        for (PassengerBogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        long startStream = System.nanoTime();

        List<PassengerBogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        System.out.println("Loop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());

        System.out.println("Execution Time (Loop): " + loopTime + " ns");
        System.out.println("Execution Time (Stream): " + streamTime + " ns");

        if (loopResult.size() == streamResult.size()) {
            System.out.println("Results match");
        } else {
            System.out.println("Results mismatch");
        }
    }
}