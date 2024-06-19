package arrays.multidimensionalarray;

import java.util.Scanner;

public class ReversingEachRowOfMatrix {
    public static void Print2DArray(int[][] array) {
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
    public static void ReversingEachRowOfMatrics(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length/2; j++) {
                int temp=array[i][j];
                array[i][j]=array[i][array[i].length-j-1];
                array[i][array[i].length-j-1]=temp;
            }
        }
        Print2DArray(array);
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
        ReversingEachRowOfMatrics(Array);

    }
}
