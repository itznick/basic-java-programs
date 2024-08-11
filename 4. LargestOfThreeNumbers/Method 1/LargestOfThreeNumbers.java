import java.util.Scanner;

class LargestOfThreeNumbers {

    static int findLargestOfThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int result = findLargestOfThree(a, b, c);
        System.out.println("The largest number is: " + result);

        scanner.close();
    }
}

// Output:
// Enter three numbers:
// 1
// 2
// 3
// The largest number is: 3