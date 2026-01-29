import java.util.Scanner;

public class SymmetricMatrix {

    public static boolean isSymmetric(int[][] m) {
        int n = m.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (m[i][j] != m[j][i]) {
                    return false;
                }
            }
        }
        return true;
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

        if (isSymmetric(m)) {
            System.out.println("The matrix is symmetric");
        } else {
            System.out.println("The matrix is not symmetric");
        }
    }
}