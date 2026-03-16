import java.util.Scanner;
class SmartDevice {
    void turnOn() {
        System.out.println("Device turned on");
    }
}
class Light extends SmartDevice {
    void turnOn() {
        System.out.println("Light is turned on");
    }
}
class Fan extends SmartDevice {
    void turnOn() {
        System.out.println("Fan is turned on");
    }
}
class AirConditioner extends SmartDevice {
    void turnOn() {
        System.out.println("Air Conditioner is turned on");
    }
}
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartDevice d;
        System.out.println("1 Light");
        System.out.println("2 Fan");
        System.out.println("3 AirConditioner");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                d = new Light();
                d.turnOn();
                break;
            case 2:
                d = new Fan();
                d.turnOn();
                break;
            case 3:
                d = new AirConditioner();
                d.turnOn();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}