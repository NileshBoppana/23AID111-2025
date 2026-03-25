import java.util.Scanner;

class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accNo) {
        accountNumber = accNo;
        balance = 0;
    }

    BankAccount(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class Main57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number:");
        int accNo1 = sc.nextInt();
        BankAccount a1 = new BankAccount(accNo1);

        System.out.println("Enter account number and initial balance:");
        int accNo2 = sc.nextInt();
        double bal = sc.nextDouble();
        BankAccount a2 = new BankAccount(accNo2, bal);

        System.out.println("Account 1:");
        a1.display();

        System.out.println("Account 2:");
        a2.display();
    }
}