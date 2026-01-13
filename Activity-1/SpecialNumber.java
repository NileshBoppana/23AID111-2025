import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int temp = num;

        while (temp > 0) {
            sum += temp % 10;   // get last digit
            temp = temp / 10;  // remove last digit
        }

        if (sum % 2 == 0) {
            System.out.println(num + " is a Special Number");
        } else {
            System.out.println(num + " is NOT a Special Number");
        }
    }
}