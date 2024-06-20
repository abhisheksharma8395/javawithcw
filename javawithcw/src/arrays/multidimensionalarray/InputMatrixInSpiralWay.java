package arrays.multidimensionalarray;

import java.util.Scanner;

public class InputMatrixInSpiralWay {
    public static void PrintinfMatrixinSpiralOrder(int[][] array,int row) {
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
        for (int i = 0; i <= row/2; i++) {
            for (int j = i; j <= row-1-i; j++) {
                Array[i][j]=sc.nextInt();
            }
            for (int j = i+1; j <= row-1-i ; j++) {
                Array[j][row-i-1]=sc.nextInt();
            }
            for (int j = row-i-2; j >= i ; j--) {
                Array[row-i-1][j]=sc.nextInt();
            }
            for (int j = row-i-2; j > i ; j--) {
                Array[j][i]=sc.nextInt();
            }
        }
        PrintinfMatrixinSpiralOrder(Array,row);
    }
}
