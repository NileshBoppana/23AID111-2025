class Vehicle {
    public String type = "Vehicle";
}

class Car extends Vehicle {
    public String type = "Car";

    public void display() {
        System.out.println("Child type: " + type);
        System.out.println("Parent type: " + super.type);
    }
}

public class CarSuperDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}