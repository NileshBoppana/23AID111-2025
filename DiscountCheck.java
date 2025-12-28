import java.util.Scanner;

public class DiscountCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the bill amount (₹): ");
        double billAmount = sc.nextDouble();

        if (billAmount > 1000) {
            System.out.println("Discount is applicable.");
        } else {
            System.out.println("Discount is not applicable.");
        }

        sc.close();
    }
}