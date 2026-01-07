import java.util.Scanner;

public class ReverseBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = 0;

        while (num > 0) {
            reversed = (reversed << 1) | (num & 1);
            num = num >> 1;
        }

        System.out.println("Reversed bits value: " + reversed);

        sc.close();
    }
}