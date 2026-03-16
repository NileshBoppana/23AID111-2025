import java.util.Scanner;

class PaymentProcessor {
    void processPayment(double amount) {
        System.out.println("Cash payment of " + amount + " processed");
    }
    void processPayment(double amount, String cardNumber) {
        System.out.println("Card payment of " + amount + " processed with card " + cardNumber);
    }
    void processPayment(double amount, String upiId, boolean upi) {
        System.out.println("UPI payment of " + amount + " processed with UPI ID " + upiId);
    }
}
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentProcessor p = new PaymentProcessor();
        System.out.println("1 Cash Payment");
        System.out.println("2 Card Payment");
        System.out.println("3 UPI Payment");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter amount: ");
                double cash = sc.nextDouble();
                p.processPayment(cash);
                break;
            case 2:
                System.out.print("Enter amount: ");
                double cardAmount = sc.nextDouble();
                System.out.print("Enter card number: ");
                String card = sc.next();
                p.processPayment(cardAmount, card);
                break;
            case 3:
                System.out.print("Enter amount: ");
                double upiAmount = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter UPI ID: ");
                String upiId = sc.nextLine();
                p.processPayment(upiAmount, upiId, true);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}