import java.util.Scanner;

public class CheckSuffix {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Check if the second string is a suffix of the first string
        boolean isSuffix = firstString.endsWith(secondString);

        // Check if the first string is a suffix of the second string
        boolean isPrefix = secondString.endsWith(firstString);

        // Display the result
        if (isSuffix) {
            System.out.println("The second string is a suffix of the first string.");
        } else if (isPrefix) {
            System.out.println("The first string is a suffix of the second string.");
        } else {
            System.out.println("Neither string is a suffix of the other.");
        }

        // Close the Scanner
        scanner.close();
    }
}
