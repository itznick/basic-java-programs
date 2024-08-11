import java.util.Scanner;

class LargestOfThreeNumbers {

    static int findLargestOfThree(int arr[]) {
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];

        System.out.println("Enter three numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int result = findLargestOfThree(numbers);
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