import java.util.Scanner;

public class ArraySum {

    static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        int result = findSum(numbers);

        System.out.println("Sum of array elements = " + result);

        sc.close();
    }
}