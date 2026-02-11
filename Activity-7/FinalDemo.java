public class FinalDemo {
    final double PI = 3.14159;

    public void display() {
        System.out.println("Value of PI: " + PI);
    }

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.display();
    }
}