import java.util.Scanner;

public class CheckStartsWithSubstring {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the main string
        System.out.print("Enter a string: ");
        String mainString = scanner.nextLine();

        // Prompt the user to enter the substring to check
        System.out.print("Enter a substring to check: ");
        String substringToCheck = scanner.nextLine();

        // Check if the main string starts with the specified substring
        boolean startsWithSubstring = mainString.startsWith(substringToCheck);

        // Display the result
        if (startsWithSubstring) {
            System.out.println("The main string starts with the specified substring.");
        } else {
            System.out.println("The main string does not start with the specified substring.");
        }

        // Close the Scanner
        scanner.close();
    }
}
