import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] digits = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }

        if (digits[0] == 0) {
            System.out.print(1 + " ");
        }

        for (int i = 0; i < n; i++) {
            System.out.print(digits[i] + " ");
        }
    }
}