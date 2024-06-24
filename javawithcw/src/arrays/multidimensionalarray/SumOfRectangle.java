package arrays.multidimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfRectangle {
    public static void Print2DArray(int[][] array) {
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

    public static int SumOfRectangle1(int[][] array, int row, int col, int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {               //Brute Force Approach
            for (int j = r1; j <= r2; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static int SumOfRectangle2(int[][] array, int row, int col, int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 1; j < col; j++) {
                array[i][j] = array[i][j] + array[i][j - 1];
            }
        }
        for (int i = l1; i <= l2; i++) {
            if (r1 != 0) {
                sum += array[i][r2] - array[i][r1 - 1];
            } else {
                sum += array[i][r2];
            }
        }
        return sum;
    }

    public static int SumOfRectangle3(int[][] array, int row, int col, int l1, int r1, int l2, int r2) {
        for (int i = 0; i < row; i++) {
            for (int j = 1; j < col; j++) {
                array[i][j] = array[i][j] + array[i][j - 1];
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = array[i][j] + array[i-1][j];
            }
        }
        int sum = array[l2][r2]-array[l1-1][r2]-array[l2][r1-1]+array[l1-1][r1-1];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows of matrics :");
        int row = sc.nextInt();
        System.out.println("Enter Number of Columns of matrics :");
        int col = sc.nextInt();
        int[][] Array = new int[row][col];
        int[][] Array1 = new int[row][col];
        for (int i = 0; i < row; i++) {
            Array1[i] = Array[i].clone();
        }

        System.out.println("Enter the Elements of matrics ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter l1(row number) and r1(col number) respectively :");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        System.out.println("Enter l2(row number) and r2(col number) respectively :");
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("The sum is : ");
        System.out.println(SumOfRectangle1(Array, row, col, l1, r1, l2, r2));
        System.out.println(SumOfRectangle2(Array1, row, col, l1, r1, l2, r2));
        System.out.println(SumOfRectangle3(Array, row, col, l1, r1, l2, r2));
    }
}
