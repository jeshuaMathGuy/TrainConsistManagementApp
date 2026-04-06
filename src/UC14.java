// Custom exception class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// PassengerBogie class
class PassengerBogie {
    private String type;
    private int capacity;

    // Constructor with validation
    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}

// Test class / main program
public class UC14 {

    public static void main(String[] args) {
        try {
            // Valid bogie
            PassengerBogie sleeperBogie = new PassengerBogie("Sleeper", 60);
            System.out.println("Created bogie: " + sleeperBogie.getType() + " with capacity " + sleeperBogie.getCapacity());

            // Invalid bogie (negative capacity)
            PassengerBogie invalidBogie = new PassengerBogie("AC Chair", -10);
            System.out.println("Created bogie: " + invalidBogie.getType() + " with capacity " + invalidBogie.getCapacity());
        } catch (InvalidCapacityException e) {
            System.out.println("Error creating bogie: " + e.getMessage());
        }

        try {
            // Invalid bogie (zero capacity)
            PassengerBogie zeroBogie = new PassengerBogie("First Class", 0);
            System.out.println("Created bogie: " + zeroBogie.getType() + " with capacity " + zeroBogie.getCapacity());
        } catch (InvalidCapacityException e) {
            System.out.println("Error creating bogie: " + e.getMessage());
        }

        // Multiple valid bogies
        try {
            PassengerBogie acBogie = new PassengerBogie("AC Chair", 50);
            PassengerBogie fcBogie = new PassengerBogie("First Class", 40);
            System.out.println("Created bogie: " + acBogie.getType() + " with capacity " + acBogie.getCapacity());
            System.out.println("Created bogie: " + fcBogie.getType() + " with capacity " + fcBogie.getCapacity());
        } catch (InvalidCapacityException e) {
            System.out.println("Error creating bogie: " + e.getMessage());
        }
    }
}