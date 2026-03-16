import java.util.Scanner;

class Search {
    void search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Integer found at index " + i);
                return;
            }
        }
        System.out.println("Integer not found");
    }
    void search(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                System.out.println("String found at index " + i);
                return;
            }
        }
        System.out.println("String not found");
    }
    void search(int[] arr, int key, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == key) {
                System.out.println("Integer found at index " + i);
                return;
            }
        }
        System.out.println("Integer not found in range");
    }
}
public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Search s = new Search();
        System.out.println("1 Integer Search");
        System.out.println("2 String Search");
        System.out.println("3 Integer Search in Range");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                int[] a = {10, 20, 30, 40, 50};
                System.out.print("Enter number: ");
                int key = sc.nextInt();
                s.search(a, key);
                break;
            case 2:
                sc.nextLine();
                String[] b = {"apple", "banana", "mango"};
                System.out.print("Enter word: ");
                String word = sc.nextLine();
                s.search(b, word);
                break;
            case 3:
                int[] c = {5, 10, 15, 20, 25};
                System.out.print("Enter number: ");
                int num = sc.nextInt();
                System.out.print("Enter start index: ");
                int start = sc.nextInt();
                System.out.print("Enter end index: ");
                int end = sc.nextInt();
                s.search(c, num, start, end);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}