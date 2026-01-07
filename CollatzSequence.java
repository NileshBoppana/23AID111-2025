import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        System.out.print("Collatz sequence: ");

        while (n != 1) {
            System.out.print(n + " ");

            if (n % 2 == 0) {
                n = n / 2;      
            } else {
                n = 3 * n + 1;  
            }
        }

        System.out.println(1); 
        sc.close();
    }
}