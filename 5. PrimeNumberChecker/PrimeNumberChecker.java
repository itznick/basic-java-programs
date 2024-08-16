import java.util.Scanner;

class PrimeNumberChecker {

    static void isPrime(int num) {
        if (num <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        if (num == 1) {
            System.out.println(num + " is neither a prime nor composite.");
            return;
        }

        if (num == 2 || num == 3) {
            System.out.println(num + " is a prime number.");
            return;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            System.out.println(num + " is not a prime number.");
            return;
        }

        for (int i = 5; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number.");
                return;
            }
        }

        System.out.println(num + " is a prime number.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any positive number: ");
        int num = scanner.nextInt();
        isPrime(num);
        scanner.close();
    }
}