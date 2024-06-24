import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Compare the strings for equality (case-sensitive)
        boolean isEqual = firstString.equals(secondString);

        // Compare the strings for equality (case-insensitive)
        boolean isEqualIgnoreCase = firstString.equalsIgnoreCase(secondString);

        // Display the result
        if (isEqual) {
            System.out.println("The two strings are equal (case-sensitive).");
        } else if (isEqualIgnoreCase) {
            System.out.println("The two strings are equal (case-insensitive).");
        } else {
            System.out.println("The two strings are not equal.");
        }

        // Close the Scanner
        scanner.close();
    }
}
