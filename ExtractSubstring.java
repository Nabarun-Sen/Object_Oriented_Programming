public class ExtractSubstring {
    public static void main(String[] args) {
        // Original string
        String originalString = "This is a sample string";

        // Define the lower and upper bounds (inclusive)
        int lowerBound = 3; // 4th character
        int upperBound = 9; // 10th character

        // Check if the bounds are within the string's length
        if (lowerBound >= 0 && upperBound < originalString.length()) {
            // Extract the substring
            String extractedSubstring = originalString.substring(lowerBound, upperBound + 1);

            System.out.println("Original String: " + originalString);
            System.out.println("Extracted Substring: " + extractedSubstring);
        } else {
            System.out.println("Bounds are out of range for the string.");
        }
    }
}
