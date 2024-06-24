import java.util.Scanner;

public class StringLengthWithoutSpaces {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Remove white spaces from the string
        String stringWithoutSpaces = inputString.replaceAll("\\s", "");

        // Calculate the length of the string without spaces
        int lengthWithoutSpaces = stringWithoutSpaces.length();

        // Display the length of the string without spaces
        System.out.println("Length of the string without spaces: " + lengthWithoutSpaces);

        // Close the Scanner
        scanner.close();
    }
}
