import java.util.Scanner;

public class Determinant5x5 {

    // Function to calculate determinant
    static int determinant(int[][] mat, int n) {
        int det = 0;

        // Base case: 1x1 matrix
        if (n == 1)
            return mat[0][0];

        int[][] temp = new int[n][n];
        int sign = 1;

        for (int f = 0; f < n; f++) {
            getCofactor(mat, temp, 0, f, n);
            det += sign * mat[0][f] * determinant(temp, n - 1);
            sign = -sign;
        }
        return det;
    }

    // Function to get cofactor
    static void getCofactor(int[][] mat, int[][] temp, int p, int q, int n) {
        int i = 0, j = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row != p && col != q) {
                    temp[i][j++] = mat[row][col];
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;

        int[][] matrix = new int[n][n];

        System.out.println("Enter elements of 5x5 matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int det = determinant(matrix, n);
        System.out.println("Determinant of the matrix = " + det);

        sc.close();
    }
}