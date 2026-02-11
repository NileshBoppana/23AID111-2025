public class UtilityConfig {
    public static final String APP_NAME = "MyUtilityApp";
    public static final int MAX_USERS = 100;
    public static final double VERSION = 1.0;

    public static void display() {
        System.out.println("App Name: " + APP_NAME);
        System.out.println("Max Users: " + MAX_USERS);
        System.out.println("Version: " + VERSION);
    }

    public static void main(String[] args) {
        UtilityConfig.display();
    }
}