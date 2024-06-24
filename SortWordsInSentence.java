import java.util.*;

public class SortWordsInSentence {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        // Split the sentence into words using space as the delimiter
        String[] words = inputSentence.split(" ");

        // Sort the words
        Arrays.sort(words);

        // Display the sorted words
        System.out.println("Words in sorted order:");
        for (String word : words) {
            System.out.println(word);
        }

        // Close the Scanner
        scanner.close();
    }
}
