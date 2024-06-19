package arrays.multidimensionalarray;

import java.util.Scanner;

public class AdditionOfTwoMatrices {
    public static void Print2DArray(int[][] array) {
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows :");
        int row = sc.nextInt();
        System.out.println("Enter Number of Columns :");
        int col = sc.nextInt();
        int[][] A = new int[row][col];
        int[][] B = new int[row][col];
        int[][] sum = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the "+i+","+j+" element of A Matrics :");
                A[i][j] = sc.nextInt();
                System.out.println("Enter the "+i+","+j+" element of B Matrics :");
                B[i][j] = sc.nextInt();
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Sum Matrics is :");
        Print2DArray(sum);
    }
}
