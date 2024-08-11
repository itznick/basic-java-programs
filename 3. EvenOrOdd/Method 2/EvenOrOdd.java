import java.util.Scanner;

class EvenOrOdd {

    static String findEvenOrOdd(int num) {
        return num % 2 == 0 ? "Number is Even" : "Number is Odd";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
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