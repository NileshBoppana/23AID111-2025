import java.util.Scanner;

interface Shape {
    void area();
}

class Circle implements Shape {
    double radius;

    public void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}

public class Main80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();

        System.out.print("Enter radius: ");
        c.radius = sc.nextDouble();

        c.area();
    }
}