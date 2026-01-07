import java.util.Scanner;

public class UpperToLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an uppercase letter: ");
        char ch = sc.next().charAt(0);

        // Convert uppercase to lowercase using ASCII value
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
            System.out.println("Lowercase letter: " + ch);
        } else {
            System.out.println("Please enter an uppercase letter.");
        }

        sc.close();
    }
}