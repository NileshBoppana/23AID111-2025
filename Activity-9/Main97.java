import java.util.Scanner;

class InvalidFormatException extends Exception {
    public InvalidFormatException(String message) {
        super(message);
    }
}

class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

class LoginSystem {
    String validUsername = "admin";
    String validPassword = "1234";

    void login(String username, String password) throws InvalidFormatException, AuthenticationException {
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            throw new InvalidFormatException("Username or password cannot be empty.");
        }

        if (!username.matches("[a-zA-Z]+")) {
            throw new InvalidFormatException("Username must contain only letters.");
        }

        if (!username.equals(validUsername) || !password.equals(validPassword)) {
            throw new AuthenticationException("Invalid credentials.");
        }

        System.out.println("Login successful.");
    }
}

public class Main97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoginSystem system = new LoginSystem();

        try {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            system.login(username, password);
        } 
        catch (InvalidFormatException e) {
            System.out.println("Format Error: " + e.getMessage());
        } 
        catch (AuthenticationException e) {
            System.out.println("Authentication Error: " + e.getMessage());
        } 
        finally {
            System.out.println("Process completed.");
            sc.close();
        }
    }
}