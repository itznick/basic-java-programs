import java.util.Scanner;

public class EvenOrOdd {

    public static boolean isEven(int number) {
        if (number == 0)
            return true;
        if (number == 1)
            return false;
        return isEven(number - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        if (isEven(num)) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }

        scanner.close();
    }
}

// Output 1: 
// Enter the number: 4
// Number is Even

// Output 2: 
// Enter the number: 7
// Number is Odd