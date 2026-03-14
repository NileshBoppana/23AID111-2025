public class Printer {

    void print(int n) {
        System.out.println("Number: " + n);
    }

    void print(String t) {
        System.out.println("Text: " + t);
    }

    void print(int n, String t) {
        System.out.println("Number: " + n + " Text: " + t);
    }

    public static void main(String[] args) {
        Printer p = new Printer();

        p.print(10);
        p.print("Hello");
        p.print(5, "Pages");
    }
}