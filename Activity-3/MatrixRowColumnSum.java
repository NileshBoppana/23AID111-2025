import java.util.Scanner;

public class MatrixRowColumnSum {

    public static void rowSum(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int sum = 0;
            for (int j = 0; j < m[0].length; j++) {
                sum += m[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + sum);
        }
    }

    public static void columnSum(int[][] m) {
        for (int j = 0; j < m[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < m.length; i++) {
                sum += m[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + ": " + sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[3][3];
        System.out.println("Enter elements of 3x3 matrix:");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        rowSum(m);
        columnSum(m);
    }
}