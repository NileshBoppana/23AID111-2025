import java.util.Scanner;

class DiscountCalculator {
    void calculateDiscount(double price) {
        double discount = price * 0.05;
        double finalPrice = price - discount;
        System.out.println("Final Price: " + finalPrice);
    }
    void calculateDiscount(double price, String membership) {
        double discount;
        if (membership.equalsIgnoreCase("Gold")) {
            discount = price * 0.10;
        } else if (membership.equalsIgnoreCase("Silver")) {
            discount = price * 0.07;
        } else {
            discount = price * 0.05;
        }
        double finalPrice = price - discount;
        System.out.println("Final Price: " + finalPrice);
    }
    void calculateDiscount(double price, String membership, String coupon) {
        double discount = price * 0.10;
        double couponDiscount = 50;
        double finalPrice = price - discount - couponDiscount;
        System.out.println("Final Price: " + finalPrice);
    }
}
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiscountCalculator d = new DiscountCalculator();
        System.out.println("1 Price Only");
        System.out.println("2 Price with Membership");
        System.out.println("3 Price with Membership and Coupon");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter price: ");
                double price = sc.nextDouble();
                d.calculateDiscount(price);
                break;
            case 2:
                System.out.print("Enter price: ");
                double p = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter membership type: ");
                String m = sc.nextLine();
                d.calculateDiscount(p, m);
                break;
            case 3:
                System.out.print("Enter price: ");
                double pr = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter membership type: ");
                String mem = sc.nextLine();
                System.out.print("Enter coupon code: ");
                String c = sc.nextLine();
                d.calculateDiscount(pr, mem, c);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}