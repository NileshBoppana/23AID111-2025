import account.Account;
import transaction.Transaction;
import reporting.Report;

public class Main88 {
    public static void main(String[] args) {
        Account acc = new Account();
        Transaction trans = new Transaction();
        Report rep = new Report();

        acc.showAccountDetails();
        trans.performTransaction();
        rep.generateReport();
    }
}