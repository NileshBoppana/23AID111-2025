import java.util.Scanner;

class Logger {
    void log(String message) {
        System.out.println("Message: " + message);
    }
    void log(String message, String time) {
        System.out.println("Message: " + message + " Time: " + time);
    }
    void log(String message, String time, int code) {
        System.out.println("Message: " + message + " Time: " + time + " ErrorCode: " + code);
    }
}
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Logger l = new Logger();
        System.out.println("1 Message");
        System.out.println("2 Message with Time");
        System.out.println("3 Message with Time and ErrorCode");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Enter message: ");
                String m1 = sc.nextLine();
                l.log(m1);
                break;
            case 2:
                System.out.print("Enter message: ");
                String m2 = sc.nextLine();
                System.out.print("Enter time: ");
                String t = sc.nextLine();
                l.log(m2, t);
                break;
            case 3:
                System.out.print("Enter message: ");
                String m3 = sc.nextLine();
                System.out.print("Enter time: ");
                String t1 = sc.nextLine();
                System.out.print("Enter error code: ");
                int code = sc.nextInt();
                l.log(m3, t1, code);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}