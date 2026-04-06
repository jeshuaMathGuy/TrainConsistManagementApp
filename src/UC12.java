import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Regex patterns
        String trainIDPattern = "TRN-\\d{4}";    // TRN- followed by exactly 4 digits
        String cargoCodePattern = "PET-[A-Z]{2}"; // PET- followed by exactly 2 uppercase letters

        // Compile patterns
        Pattern trainPattern = Pattern.compile(trainIDPattern);
        Pattern cargoPattern = Pattern.compile(cargoCodePattern);

        // User input
        System.out.print("Enter Train ID: ");
        String trainID = scanner.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = scanner.nextLine();

        // Validate Train ID
        Matcher trainMatcher = trainPattern.matcher(trainID);
        if (trainMatcher.matches()) {
            System.out.println("Train ID is valid.");
        } else {
            System.out.println("Invalid Train ID! Format must be TRN-1234.");
        }

        // Validate Cargo Code
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);
        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is valid.");
        } else {
            System.out.println("Invalid Cargo Code! Format must be PET-AB (uppercase letters).");
        }

        scanner.close();
    }
}