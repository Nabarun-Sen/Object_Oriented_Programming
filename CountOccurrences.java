import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the original string
        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        // Prompt the user to enter the character or substring to count
        System.out.print("Enter the character or substring to count: ");
        String charOrSubstring = scanner.nextLine();

        // Initialize a count variable to keep track of occurrences
        int count = 0;

        // Start searching from the beginning of the string
        int index = originalString.indexOf(charOrSubstring);

        // Iterate through the string while there are more occurrences
        while (index != -1) {
            count++;
            // Move the index to the next position after the last occurrence
            index = originalString.indexOf(charOrSubstring, index + 1);
        }

        // Display the result
        System.out.println("Occurrences of '" + charOrSubstring + "': " + count);

        // Close the Scanner
        scanner.close();
    }
}
