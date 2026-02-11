class Account {
    public int accNo;
    public String holderName;
    public double balance;

    public void showAccount() {
        System.out.println("Account No: " + accNo);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    public double interestRate;

    public void showSavings() {
        showAccount();
        System.out.println("Interest Rate: " + interestRate);
    }
}

class CurrentAccount extends Account {
    public double overdraftLimit;

    public void showCurrent() {
        showAccount();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.accNo = 1001;
        sa.holderName = "Nilesh";
        sa.balance = 50000;
        sa.interestRate = 4.5;

        CurrentAccount ca = new CurrentAccount();
        ca.accNo = 2001;
        ca.holderName = "Rahul";
        ca.balance = 30000;
        ca.overdraftLimit = 10000;

        sa.showSavings();
        System.out.println();
        ca.showCurrent();
    }
}