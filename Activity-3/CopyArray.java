import java.util.Scanner;

public class CopyArray {

    public static int[] copyArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.println("Enter 10 integers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] copiedArr = copyArray(arr);

        System.out.println("Copied array:");
        for (int i = 0; i < copiedArr.length; i++) {
            System.out.print(copiedArr[i] + " ");
        }
    }
}