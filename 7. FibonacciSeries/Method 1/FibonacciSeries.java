import java.util.Scanner;

class FibonacciSeries {

    static void fibonacciCalculator(long num) {
        long totalNumber = num;
        long currentNum = 1;
        long previousNum = 0;

        if (totalNumber == 0) {
            System.out.println("No number to display.");
        } else if (num == 1) {
            System.out.println("Fibonacci Series: 0");
        } else {
            for (int i = 1; i <= totalNumber; ++i) {
                System.out.print(previousNum + " ");
                long nextNum = previousNum + currentNum;
                previousNum = currentNum;
                currentNum = nextNum;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = scanner.nextLong();

        System.out.println("Fibonacci Series up to " + num + " number is: ");
        fibonacciCalculator(num);
        scanner.close();
    }
}