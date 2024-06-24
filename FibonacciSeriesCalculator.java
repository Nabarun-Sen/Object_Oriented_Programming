import java.util.Scanner;
 
public class FibonacciSeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n to calculate the Fibonacci series up to nth term: ");
        int n = scanner.nextInt();
        scanner.close();
 
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(calculateFibonacci(i) + " ");
        }
    }
 
    private static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }
}