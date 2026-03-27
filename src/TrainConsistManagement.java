import java.util.*;
import java.util.stream.*;

class GoodsBogie {
    private String type;   // Rectangular / Cylindrical / Open / Box
    private String cargo;  // Petroleum / Coal / Grain etc.

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "Bogie Type: " + type + ", Cargo: " + cargo;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        // Sample Goods Bogies List
        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Rectangular", "Coal"),
                new GoodsBogie("Open", "Grain"),
                new GoodsBogie("Cylindrical", "Petroleum")
        );

        // Display bogies
        System.out.println("Goods Bogies in Train:");
        bogies.forEach(System.out::println);


        boolean isSafe = bogies.stream()
                .allMatch(bogie ->
                        // Rule: If Cylindrical → must carry Petroleum
                        !bogie.getType().equalsIgnoreCase("Cylindrical") ||
                                bogie.getCargo().equalsIgnoreCase("Petroleum")
                );

        // Result
        if (isSafe) {
            System.out.println("\nTrain is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("\nTrain is NOT SAFE ❌");
        }
    }
}