import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();
        
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Create a HashMap to store word frequencies
        Map<String, Integer> wordFrequency = new HashMap<>();
        
        // Count the frequency of each word
        for (String word : words) {
            word = word.toLowerCase(); // Convert to lowercase to ensure case-insensitivity
            if (wordFrequency.containsKey(word)) {
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            } else {
                wordFrequency.put(word, 1);
            }
        }
        
        // Find the word with the highest frequency
        String mostFrequentWord = "";
        int maxFrequency = 0;
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentWord = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }
        
        System.out.println("The word with the highest frequency is: " + mostFrequentWord);
        System.out.println("Frequency: " + maxFrequency);
    }
}
