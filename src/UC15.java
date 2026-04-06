// Custom runtime exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// GoodsBogie class
class GoodsBogie {
    private String shape; // "Rectangular" or "Cylindrical"
    private String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
        this.cargo = "Empty";
    }

    public String getShape() {
        return shape;
    }

    public String getCargo() {
        return cargo;
    }

    // Assign cargo with safety check
    public void assignCargo(String cargoType) {
        try {
            if ("Rectangular".equalsIgnoreCase(shape) && "Petroleum".equalsIgnoreCase(cargoType)) {
                throw new CargoSafetyException("Unsafe cargo assignment: Petroleum cannot go into Rectangular bogie!");
            }
            // Safe assignment
            this.cargo = cargoType;
            System.out.println("Cargo " + cargoType + " assigned to " + shape + " bogie successfully.");
        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Cargo assignment attempt completed for " + shape + " bogie.\n");
        }
    }
}

// Main program to demonstrate UC15
public class UC15 {

    public static void main(String[] args) {
        GoodsBogie rectBogie = new GoodsBogie("Rectangular");
        GoodsBogie cylBogie = new GoodsBogie("Cylindrical");

        // Attempt unsafe cargo assignment
        rectBogie.assignCargo("Petroleum");

        // Safe cargo assignment
        cylBogie.assignCargo("Petroleum");

        // Another safe assignment
        rectBogie.assignCargo("Coal");

        // Program continues
        System.out.println("Rectangular bogie now carries: " + rectBogie.getCargo());
        System.out.println("Cylindrical bogie now carries: " + cylBogie.getCargo());
        System.out.println("Application continues execution safely.");
    }
}