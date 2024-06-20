package arrays.multidimensionalarray;

import java.util.Scanner;

public class SpiralMatrics {
//    public static void Print2DArray(int[][] array) {
//        for (int[] i : array) {
//            for (int j : i) {
//                System.out.print(j + " ");
//            }
//            System.out.println(" ");
//        }
//    }
    public static void SpiralMatricsMaker(int[][] array,int row) {

        for (int i = 0; i <= row/2; i++) {
            for (int j = i; j <= row-1-i; j++) {
                System.out.print(array[i][j]+" ");
            }
            for (int j = i+1; j <= row-1-i ; j++) {
                System.out.print(array[j][row-i-1]+" ");
            }
            for (int j = row-i-2; j >= i ; j--) {
                System.out.print(array[row-i-1][j]+" ");
            }
            for (int j = row-i-2; j > i ; j--) {
                System.out.print(array[j][i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows of matrics :");
        int row = sc.nextInt();
        int[][] Array = new int[row][row];
        System.out.println("Enter the Elements of matrics ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                Array[i][j] = sc.nextInt();
            }
        }
        SpiralMatricsMaker(Array,row);
    }
}
