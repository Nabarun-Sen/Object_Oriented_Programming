public class StringCaseConversion {
    public static void main(String[] args) {
        // Original string
        String originalString = "Hello, World!";

        // Convert to lowercase
        String lowercaseString = originalString.toLowerCase();

        // Convert to uppercase
        String uppercaseString = originalString.toUpperCase();

        // Convert to toggle case
        String toggleCaseString = toggleCase(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Lowercase: " + lowercaseString);
        System.out.println("Uppercase: " + uppercaseString);
        System.out.println("Toggle Case: " + toggleCaseString);
    }

    // Custom method to toggle case
    public static String toggleCase(String input) {
        StringBuilder toggled = new StringBuilder(input.length());

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggled.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggled.append(Character.toUpperCase(c));
            } else {
                toggled.append(c);
            }
        }

        return toggled.toString();
    }
}
