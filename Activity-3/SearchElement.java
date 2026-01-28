import java.util.Scanner;

public class SearchElement {
    public static boolean search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        if (search(arr, key)) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}