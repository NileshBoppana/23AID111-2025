import java.util.Scanner;

class Printer {
    void print(int n) {
        System.out.println("Number: " + n);
    }

    void print(String s) {
        System.out.println("Text: " + s);
    }

    void print(int n, String s) {
        System.out.println("Number: " + n + " Text: " + s);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Printer p = new Printer();

        System.out.println("1. Print Number");
        System.out.println("2. Print Text");
        System.out.println("3. Print Number and Text");

        int ch = sc.nextInt();
        sc.nextLine();

        switch (ch) {
            case 1:
                System.out.println("Enter number:");
                int num = sc.nextInt();
                p.print(num);
                break;

            case 2:
                System.out.println("Enter text:");
                String text = sc.nextLine();
                p.print(text);
                break;

            case 3:
                System.out.println("Enter number:");
                int n = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter text:");
                String t = sc.nextLine();
                p.print(n, t);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}