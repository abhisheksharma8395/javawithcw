package arrays.multidimensionalarray;

import java.util.Scanner;

public class PascalTriangle {
    public static void Print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void PascalTriangleMaker(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i - 1][j] + array[i - 1][j - 1];
                }
            }
        }
        Print2DArray(array);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows of matrics :");
        int row1 = sc.nextInt();
        int[][] Array = new int[row1][row1];
        PascalTriangleMaker(Array);
    }
}
