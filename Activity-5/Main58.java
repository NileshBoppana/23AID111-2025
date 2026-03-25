class Shape {

    double area(double radius) {
        return 3.14 * radius * radius;
    }

    double area(double length, double breadth) {
        return length * breadth;
    }
}

public class Main58 {
    public static void main(String[] args) {
        Shape s = new Shape();

        double circleArea = s.area(5.0);
        double rectangleArea = s.area(4.0, 3.0);

        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}