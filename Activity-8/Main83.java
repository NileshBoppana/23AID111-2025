interface Payment {
    void processPayment();
}

class CreditCard implements Payment {
    public void processPayment() {
        System.out.println("Payment done using Credit Card");
    }
}

class UPI implements Payment {
    public void processPayment() {
        System.out.println("Payment done using UPI");
    }
}

public class Main83 {
    public static void main(String[] args) {
        CreditCard c = new CreditCard();
        UPI u = new UPI();

        c.processPayment();
        u.processPayment();
    }
}