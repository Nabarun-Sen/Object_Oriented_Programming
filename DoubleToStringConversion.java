public class DoubleToStringConversion {
    public static void main(String[] args) {
        // Method 1: Using String.valueOf()
        double doubleValue = 123.456;
        String stringValue1 = String.valueOf(doubleValue);

        System.out.println("Using String.valueOf():");
        System.out.println("Double value: " + doubleValue);
        System.out.println("String value: " + stringValue1);

        // Method 2: Using concatenation with an empty string
        double doubleValue2 = 789.123;
        String stringValue2 = doubleValue2 + "";

        System.out.println("\nUsing concatenation with an empty string:");
        System.out.println("Double value: " + doubleValue2);
        System.out.println("String value: " + stringValue2);
    }
}
