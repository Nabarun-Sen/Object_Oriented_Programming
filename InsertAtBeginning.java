import java.util.Scanner;

public class InsertAtBeginning {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the original string
        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        // Prompt the user to enter the character or substring to insert
        System.out.print("Enter the character or substring to insert at the beginning: ");
        String substringToInsert = scanner.nextLine();

        // Insert the substring at the beginning of the original string
        String resultString = substringToInsert + originalString;

        // Display the result
        System.out.println("Original String: " + originalString);
        System.out.println("Inserted String: " + resultString);

        // Close the Scanner
        scanner.close();
    }
}
