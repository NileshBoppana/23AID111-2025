interface Shape {
    void area();
}

class Circle implements Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

public class Main80 {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        c.area();
    }
}