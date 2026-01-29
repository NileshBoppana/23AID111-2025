import java.util.Scanner;

public class CountArrayElements {

    public static int countPositive(int[] arr) {
        int count = 0;
        for (int x : arr) {
            if (x > 0) {
                count++;
            }
        }
        return count;
    }

    public static int countNegative(int[] arr) {
        int count = 0;
        for (int x : arr) {
            if (x < 0) {
                count++;
            }
        }
        return count;
    }

    public static int countEven(int[] arr) {
        int count = 0;
        for (int x : arr) {
            if (x % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countOdd(int[] arr) {
        int count = 0;
        for (int x : arr) {
            if (x % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.println("Enter 10 integers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Positive numbers: " + countPositive(arr));
        System.out.println("Negative numbers: " + countNegative(arr));
        System.out.println("Even numbers: " + countEven(arr));
        System.out.println("Odd numbers: " + countOdd(arr));
    }
}