package arrays.questions;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElement {
    public static int FindMax(int[] array) {
        int n = array.length;
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    public static int SecondMax(int[] array) {

        int max = FindMax(array);
        for (int i = 0; i < array.length; i++) {
            if(array[i]==max){
                array[i]=Integer.MIN_VALUE;
            }
        }
        return FindMax(array);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Array = new int[n];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        System.out.println("Second Largest Element in the array in O(3n) : "+SecondMax(Array));
    }
}
