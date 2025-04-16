import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int r1;
        int c1;
        int r2;
        int c2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrices. They must be equal.");
        r1 = input.nextInt();
        c1 = input.nextInt();
        r2 = input.nextInt();
        c2 = input.nextInt();
        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] c = new int[r1][c2];
        System.out.println("Enter the numbers of the first matrix. Numbers will be added row wise \n");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the numbers of the 2nd matrix. Numbers will be added row wise.  \n");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = input.nextInt();
            }
        }
        System.out.println("Generating the multiplication of matrices.....");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("The product of the matrices is shown as below");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}