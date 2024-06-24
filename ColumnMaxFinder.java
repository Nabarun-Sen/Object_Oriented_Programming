import java.util.Scanner;
 
public class ColumnMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
 
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
 
        int[][] array = new int[rows][columns];
 
        System.out.println("Enter elements into the array:");
 
        // Input elements into the array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
 
        System.out.println("The maximum values column-wise are:");
 
        // Find and display maximum value column-wise
        for (int j = 0; j < columns; j++) {
            int max = array[0][j];
            for (int i = 1; i < rows; i++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            System.out.println("Column " + j + ": " + max);
        }
 
        scanner.close();
    }
}