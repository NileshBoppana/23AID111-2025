import java.util.Scanner;

public class Circle {
    public double radius;

    public double findArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle circleObj = new Circle();
        System.out.print("Enter radius of circle: ");
        circleObj.radius = scanner.nextDouble();

        double areaValue = circleObj.findArea();
        System.out.println("Area = " + areaValue);
    }
}