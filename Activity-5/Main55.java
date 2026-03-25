import java.util.Scanner;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.println("Enter two integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Integer Addition: " + c.add(a, b));

        System.out.println("Enter two decimal numbers:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println("Float Addition: " + c.add(x, y));
    }
}