import java.util.Scanner;

public class FibonacciSeries {

    static long fibonacci(long num) {
        if (num <= 1) {
            return num;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    static void printFibonacci(long n) {
        for (long i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = scanner.nextLong();

        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.print("Fibonacci Series up to " + num + " is: ");
            printFibonacci(num);
        }

        scanner.close();
    }
}