import java.util.Scanner;

public class EvenOrOdd {

    static String findEvenOrOdd(int num) {
        while (num > 1) {
            num -= 2;
        }
        if (num == 0) {
            return "Number is Even";
        }

        return "Number is Odd";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        String result = findEvenOrOdd(num);
        System.out.println(result);

        scanner.close();
    }
}

// Output 1: 
// Enter the number: 4
// Number is Even

// Output 2: 
// Enter the number: 7
// Number is Odd