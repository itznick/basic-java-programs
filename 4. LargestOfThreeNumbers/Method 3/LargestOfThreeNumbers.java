import java.util.Scanner;

class LargestOfThreeNumbers {

    static int findLargestOfThree(int num1, int num2, int num3) {
        return (num1 >= num2) ? (num2 >= num3 ? num1 : num3) : (num2 >= num3 ? num2 : num3);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int result = findLargestOfThree(num1, num2, num3);
        System.out.println("Largest number is: " + result);

        scanner.close();
    }
}

// Output:
// Enter three numbers:
// 1
// 2
// 3
// The largest number is: 3