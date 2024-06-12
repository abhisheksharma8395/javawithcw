package arrays.questions;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestAndLargest {
    public static int[] SmallestAndLargestByIterative(int[] array,int k){
        Arrays.sort(array);
        return new int[]{array[k-1], array[array.length - k]};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[8];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        int k =sc.nextInt();
        int[] ans = SmallestAndLargestByIterative(Array,k);
        System.out.println("Smaller element And Largest element in Array respectively using iterative approach is : "+ans[0]+","+ans[1]);
    }
}
