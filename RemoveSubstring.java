public class RemoveSubstring {
    public static void main(String[] args) {
        // Original string
        String originalString = "RCC Institute of Information Technology";

        // Remove the first occurrence of "Information" using replace()
        String modifiedString = originalString.replaceAll("Information", "");

        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }
}
