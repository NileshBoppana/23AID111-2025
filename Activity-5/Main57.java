public class Main57 {

    static class Account {
        int accNo;
        double balance;

        Account(int a) {
            accNo = a;
            balance = 0.0;
        }

        Account(int a, double b) {
            accNo = a;
            balance = b;
        }

        void display() {
            System.out.println("Account Number: " + accNo);
            System.out.println("Balance: " + balance);
        }
    }
    public static void main(String[] args) {

        Account a1 = new Account(101);
        Account a2 = new Account(102, 5000);

        System.out.println("Account 1 Details:");
        a1.display();

        System.out.println("\nAccount 2 Details:");
        a2.display();
    }
}