package arrays.multidimensionalarray;

import java.util.Scanner;

public class MultiplicationOfTwoMatrices {
    public static void Print2DArray(int[][] array) {
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
    public static void MultiplicationMatrics(int[][] A, int[][] B, int row1, int col1, int row2, int col2) {
        if (col1 != row2) {
            System.out.println("Multiplication is not possible of these two matrices");
            return;
        }
        int[][] Multi = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    Multi[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        Print2DArray(Multi);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows for first matrics :");
        int row1 = sc.nextInt();
        System.out.println("Enter Number of Columns for first matrics :");
        int col1 = sc.nextInt();
        int[][] A = new int[row1][col1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.println("Enter the Elements of first matrics ");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Number of Rows for second matrics :");
        int row2 = sc.nextInt();
        System.out.println("Enter Number of Columns for second matrics :");
        int col2 = sc.nextInt();
        int[][] B = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.println("Enter the Elements of second matrics ");
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println("Multiplication matrix is :");
        MultiplicationMatrics(A,B,row1,col1,row2,col2);
    }
}
