package arrays.multidimensionalarray;

import java.util.Scanner;

public class InputMatrixInSpiralWay {
    public static void PrintinfMatrixinSpiralOrder(int[][] array, int row) {
        int left = 0, right = row - 1;
        int top = 0, bottom = row - 1;
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                System.out.print(array[top][j] + " ");
            }
            top++;
            for (int j = top; j <= bottom; j++) {
                System.out.print(array[j][right] + " ");
            }
            right--;
            for (int j = right; j >= left; j--) {
                System.out.print(array[bottom][j] + " ");
            }
            bottom--;
            for (int j = bottom; j >= top; j--) {
                System.out.print(array[j][left] + " ");
            }
            left++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows of matrics :");
        int row = sc.nextInt();
        int[][] Array = new int[row][row];
        System.out.println("Enter the Elements of matrics ");
        int left = 0, right = row - 1;
        int top = 0, bottom = row - 1;
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                Array[top][j] = sc.nextInt();
            }
            top++;
            for (int j = top; j <= bottom; j++) {
                Array[j][right] = sc.nextInt();
            }
            right--;
            for (int j = right; j >= left; j--) {
                Array[bottom][j] = sc.nextInt();
            }
            bottom--;
            for (int j = bottom; j >= top; j--) {
                Array[j][left] = sc.nextInt();
            }
            left++;
        }
        PrintinfMatrixinSpiralOrder(Array, row);
    }
}
