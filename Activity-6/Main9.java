import java.util.Scanner;

class Ride {
    void calculateFare(double distance) {
        System.out.println("Fare: " + distance);
    }
}
class BikeRide extends Ride {
    void calculateFare(double distance) {
        double fare = distance * 5;
        System.out.println("Bike Fare: " + fare);
    }
}
class AutoRide extends Ride {
    void calculateFare(double distance) {
        double fare = distance * 10;
        System.out.println("Auto Fare: " + fare);
    }
}
class CarRide extends Ride {
    void calculateFare(double distance) {
        double fare = distance * 15;
        System.out.println("Car Fare: " + fare);
    }
}
public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ride r;
        System.out.println("1 Bike Ride");
        System.out.println("2 Auto Ride");
        System.out.println("3 Car Ride");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        System.out.print("Enter distance: ");
        double distance = sc.nextDouble();
        switch (choice) {
            case 1:
                r = new BikeRide();
                r.calculateFare(distance);
                break;
            case 2:
                r = new AutoRide();
                r.calculateFare(distance);
                break;
            case 3:
                r = new CarRide();
                r.calculateFare(distance);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}