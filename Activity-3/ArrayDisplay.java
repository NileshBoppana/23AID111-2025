import java.util.Scanner;

public class ArrayDisplay {

    static void displayArray(int[] arr) {
        System.out.println("Array elements are:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        displayArray(numbers);

        sc.close();
    }
}