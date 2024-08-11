import java.util.Scanner;

class SumOfTwoNumbers {
    
    private static int addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = scanner.nextInt();

        int sum = addTwoNumbers(num1, num2);
        System.out.println("Sum: " + sum);

        scanner.close();
    }
}

// Output:
// Enter First Number: 5
// Enter Second Number: 5
// Sum: 10