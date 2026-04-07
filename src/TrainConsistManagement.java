// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Abstract Goods Bogie
abstract class GoodsBogie {
    protected String bogieId;
    protected String shape;
    protected String cargo;

    public GoodsBogie(String bogieId, String shape) {
        this.bogieId = bogieId;
        this.shape = shape;
    }

    public void assignCargo(String cargoType) {
        try {
            // Validation logic
            if (shape.equalsIgnoreCase("Rectangular") &&
                    cargoType.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException(
                        "Unsafe cargo! Petroleum cannot be assigned to Rectangular bogie: " + bogieId
                );
            }

            // Assign cargo if safe
            this.cargo = cargoType;
            System.out.println("✅ Cargo '" + cargoType + "' assigned to Bogie " + bogieId);

        } catch (CargoSafetyException e) {
            // Handle exception gracefully
            System.out.println("❌ ERROR: " + e.getMessage());

        } finally {
            // Always executes
            System.out.println("ℹ️ Assignment attempt completed for Bogie " + bogieId);
        }
    }

    public void displayDetails() {
        System.out.println("Bogie ID: " + bogieId +
                ", Shape: " + shape +
                ", Cargo: " + (cargo != null ? cargo : "None"));
    }
}

// Rectangular Bogie
class RectangularBogie extends GoodsBogie {
    public RectangularBogie(String bogieId) {
        super(bogieId, "Rectangular");
    }
}

// Cylindrical Bogie
class CylindricalBogie extends GoodsBogie {
    public CylindricalBogie(String bogieId) {
        super(bogieId, "Cylindrical");
    }
}

// Main Application
public class TrainConsistManagement {
    public static void main(String[] args) {

        // Create bogies
        GoodsBogie bogie1 = new RectangularBogie("RB1");
        GoodsBogie bogie2 = new CylindricalBogie("CB1");

        // Safe assignment
        bogie2.assignCargo("Petroleum");   // Should succeed

        // Unsafe assignment
        bogie1.assignCargo("Petroleum");   // Should trigger exception

        // Another safe assignment to prove continuation
        bogie1.assignCargo("Grain");

        // Display final state
        System.out.println("\n--- Final Bogie Details ---");
        bogie1.displayDetails();
        bogie2.displayDetails();
    }
}