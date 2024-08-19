import java.util.Scanner;

public class ReverseNumber {

    static int reverseNumber(int num) {
        int reversedNumber = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }

        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number to reverse: ");
        int num = scanner.nextInt();

        int result = reverseNumber(num);
        System.out.print("Reversed Number: " + result);

        scanner.close();
    }
}