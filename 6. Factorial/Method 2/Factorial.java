import java.util.Scanner;

public class Factorial {
    public static long factorial(long n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = scanner.nextLong();

        long result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}