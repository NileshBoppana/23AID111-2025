import java.util.Scanner;

public class UpperTriangularMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean isUpperTriangular = true;

        if (rows != cols) {
            isUpperTriangular = false;
        } else {
            for (int i = 1; i < rows; i++) {
                for (int j = 0; j < i; j++) {
                    if (matrix[i][j] != 0) {
                        isUpperTriangular = false;
                        break;
                    }
                }
            }
        }

        if (isUpperTriangular)
            System.out.println("The matrix is an Upper Triangular Matrix.");
        else
            System.out.println("The matrix is NOT an Upper Triangular Matrix.");

        sc.close();
    }
}