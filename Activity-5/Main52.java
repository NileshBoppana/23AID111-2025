class Rectangle {
    double length;
    double breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }
}

public class Main52 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5.0, 3.0);
        System.out.println("Area of Rectangle: " + r1.area());
    }
}