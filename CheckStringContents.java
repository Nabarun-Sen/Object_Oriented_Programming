import java.util.Scanner;

public class CheckStringContents {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Initialize flags to track character and digit presence
        boolean containsCharacters = false;
        boolean containsDigits = false;

        // Iterate through each character in the string
        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) {
                containsCharacters = true;
            } else if (Character.isDigit(c)) {
                containsDigits = true;
            }
            
            // If both characters and digits are found, no need to continue checking
            if (containsCharacters && containsDigits) {
                break;
            }
        }

        // Check the flags and display the result
        if (containsCharacters && containsDigits) {
            System.out.println("The string contains both characters and digits.");
        } else if (containsCharacters) {
            System.out.println("The string contains only characters.");
        } else if (containsDigits) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string is empty or does not contain characters or digits.");
        }

        // Close the Scanner
        scanner.close();
    }
}
