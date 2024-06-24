import java.util.Scanner;
 
public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
 
        int[] array = new int[n];
 
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
 
        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();
 
        int index = linearSearch(array, searchElement);
 
        if (index != -1) {
            System.out.println(searchElement + " found at index " + index);
        } else {
            System.out.println(searchElement + " not found in the array.");
        }
 
        scanner.close();
    }
 
    private static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}