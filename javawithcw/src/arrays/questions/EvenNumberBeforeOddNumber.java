package arrays.questions;

import java.util.Scanner;

public class EvenNumberBeforeOddNumber {
    public static void Swap(int[] array,int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void SortArrayInEvenOddOrder(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            if (array[i] % 2 != 0 && array[n - i - 1] % 2 == 0) {
                Swap(array,i,n-i-1);
            }
            else if(array[i] % 2 == 0 && array[n - i - 1] % 2 == 0){
                if (array[i]>array[n - i - 1]){
                    Swap(array,i,n-i-1);
                }
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Array = new int[n];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        System.out.println("Sorting Array in the manner so that Even number comes before odd order ");
        SortArrayInEvenOddOrder(Array);
    }
}
