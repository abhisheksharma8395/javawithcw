package arrays.multidimensionalarray;

import java.util.Scanner;

public class TwoDimensionalArrayInputAndPrint {
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
        int[][] Array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Array[i][j]=sc.nextInt();
            }
        }
        System.out.println("2 D array is :");
        Print2DArray(Array);
    }
}
