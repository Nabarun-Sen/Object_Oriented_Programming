import java.util.Scanner;

public class DisplayWordsPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        
        String word = scanner.nextLine();
        
        // Display the pyramid pattern
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.substring(0, i + 1));
        }
        
        for (int i = word.length() - 2; i >= 0; i--) {
            System.out.println(word.substring(0, i + 1));
        }
        
        scanner.close();
    }
}
