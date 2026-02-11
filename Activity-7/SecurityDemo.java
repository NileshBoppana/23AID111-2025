final class SecurityHelper {
    public void authenticate() {
        System.out.println("Authentication successful");
    }

    public void encrypt() {
        System.out.println("Data encrypted");
    }
}

public class SecurityDemo {
    public static void main(String[] args) {
        SecurityHelper helper = new SecurityHelper();
        helper.authenticate();
        helper.encrypt();
    }
}