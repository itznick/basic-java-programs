import java.util.Scanner;

class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[2];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum: " + sum);

        scanner.close();
    }
}

// Output:
// Enter the numbers:
// 1
// 2
// Sum: 3