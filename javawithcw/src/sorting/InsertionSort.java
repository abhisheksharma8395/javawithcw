package sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void ISort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while(j>0 && array[j]<array[j-1]){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--;
            }
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        ISort(array);
    }
}
