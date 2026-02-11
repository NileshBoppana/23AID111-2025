import java.util.Scanner;

public class BankAccount {
    public int accountNumber;
    public double balance;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount();

        System.out.print("Enter account number: ");
        acc.accountNumber = sc.nextInt();

        System.out.print("Enter initial balance: ");
        acc.balance = sc.nextDouble();

        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        acc.deposit(dep);

        System.out.print("Enter withdraw amount: ");
        double wd = sc.nextDouble();
        acc.withdraw(wd);

        acc.display();
    }
}