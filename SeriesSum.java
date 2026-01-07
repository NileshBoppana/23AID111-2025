import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.print("Series: ");
        for (int i = 1; i <= n; i += 5) {
            System.out.print(i + " ");
            sum = sum + i;
        }

        System.out.println("\nSum of the series = " + sum);
        sc.close();
    }
}