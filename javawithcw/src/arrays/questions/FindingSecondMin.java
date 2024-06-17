package arrays.questions;

import java.util.Scanner;

public class FindingSecondMin {
    public static int Min(int[] array){
        int Min = Integer.MAX_VALUE;
        for(int i : array){
            if(Min>i){
                Min = i;
            }
        }
        return Min;
    }
    public static int SecondMin(int[] array){
        int min = Min(array);
        for (int i = 0; i < array.length; i++) {
            if(array[i]==min){
                array[i]=Integer.MAX_VALUE;
            }
        }
        return Min(array);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Array = new int[n];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        System.out.println("Second Smallest Element in the array in O(3n) : " + SecondMin(Array));
    }
}
