import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidAccountException extends Exception {
    public InvalidAccountException(String message) {
        super(message);
    }
}

class TransactionSystem {
    double balance = 5000;

    void transfer(String accountNumber, double amount)
            throws InsufficientFundsException, InvalidAccountException {

        if (accountNumber == null || accountNumber.length() != 10) {
            throw new InvalidAccountException("Invalid account number.");
        }

        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds.");
        }

        balance -= amount;
        System.out.println("Transaction successful. Remaining balance: " + balance);
    }
}

public class OnlineTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TransactionSystem system = new TransactionSystem();

        try {
            System.out.print("Enter account number: ");
            String accNo = sc.nextLine();

            System.out.print("Enter amount to transfer: ");
            double amount = sc.nextDouble();

            system.transfer(accNo, amount);
        } 
        catch (InvalidAccountException e) {
            System.out.println("Account Error: " + e.getMessage());
        } 
        catch (InsufficientFundsException e) {
            System.out.println("Transaction Error: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Unexpected Error occurred.");
        } 
        finally {
            System.out.println("Transaction process completed.");
            sc.close();
        }
    }
}