import java.util.Scanner;
 
public class ArrayMinimumFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
 
        int[] array = new int[n];
 
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
 
        int minimum = findMinimum(array);
        System.out.println("The minimum value in the array is: " + minimum);
 
        scanner.close();
    }
 
    private static int findMinimum(int[] array) {
        int min = array[0];
 
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
 
        return min;
    }
}