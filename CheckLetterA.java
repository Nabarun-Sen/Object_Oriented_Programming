import java.util.Scanner;

public class CheckLetterA {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Method 1: Using the contains() method (case-sensitive)
        boolean containsA = inputString.contains("A") || inputString.contains("a");

        // Method 2: Iterating through the characters (case-insensitive)
        boolean containsAIterative = false;
        for (char c : inputString.toCharArray()) {
            if (c == 'A' || c == 'a') {
                containsAIterative = true;
                break;
            }
        }

        // Display the result
        if (containsA) {
            System.out.println("The letter 'A' or 'a' is present in the string (case-sensitive).");
        } else {
            System.out.println("The letter 'A' or 'a' is not present in the string (case-sensitive).");
        }

        if (containsAIterative) {
            System.out.println("The letter 'A' or 'a' is present in the string (case-insensitive).");
        } else {
            System.out.println("The letter 'A' or 'a' is not present in the string (case-insensitive).");
        }

        // Close the Scanner
        scanner.close();
    }
}
