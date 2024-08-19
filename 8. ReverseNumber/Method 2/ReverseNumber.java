import java.util.Scanner;

public class ReverseNumber {

    static int reverseNumber(int num, int reversedNumber) {
        if (num == 0) {
            return reversedNumber;
        }

        reversedNumber = reversedNumber * 10 + num % 10;
        return reverseNumber(num / 10, reversedNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number to reverse: ");
        int num = scanner.nextInt();

        int result = reverseNumber(num, 0);
        System.out.print("Reversed Number: " + result);

        scanner.close();
    }
}