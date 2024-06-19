package arrays.multidimensionalarray;

import java.util.Scanner;

public class TransposeMatrix {
    public static void Print2DArray(int[][] array) {
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
    public static void TransposeMatrics(int[][] array) {
        int row2 = array[0].length;
        int col2 = array.length;
        int[][] transpose = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                transpose[i][j]=array[j][i];
            }
        }
        Print2DArray(transpose);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows of matrics :");
        int row1 = sc.nextInt();
        System.out.println("Enter Number of Columns of matrics :");
        int col1 = sc.nextInt();
        int[][] Array = new int[row1][col1];
        System.out.println("Enter the Elements of matrics ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                Array[i][j] = sc.nextInt();
            }
        }
        TransposeMatrics(Array);

    }
}
