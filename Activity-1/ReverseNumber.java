import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;          // Step 1
            reverse = reverse * 10 + digit; // Step 2
            num = num / 10;                // Step 3
        }

        System.out.println("Reversed number: " + reverse);
    }
}