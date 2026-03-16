import java.util.Scanner;

class Notification {
    void sendNotification() {
        System.out.println("General Notification Sent");
    }
}

class EmailNotification extends Notification {
    void sendNotification() {
        System.out.println("Email Notification Sent");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. General Notification");
        System.out.println("2. Email Notification");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        Notification n;

        switch (choice) {
            case 1:
                n = new Notification();
                n.sendNotification();
                break;

            case 2:
                n = new EmailNotification();
                n.sendNotification();
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}