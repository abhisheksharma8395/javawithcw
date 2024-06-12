package arrays.questions;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestAndLargest {
    public static int[] SmallestAndLargestByIterative(int[] array){
        Arrays.sort(array);
        return new int[]{array[0], array[array.length - 1]};
    }
    public static int[] SmallestAndLargestByRecursive(int[] array){
        return smallestAndLargest(array,0,array[0],array[0]);
    }
    public static int[] smallestAndLargest(int[] array,int idx,int smallest,int largest){
        if(idx >= array.length){
            return new int[]{smallest,largest};
        }
        if(array[idx]<smallest){
            smallest=array[idx];
        }
        if(array[idx]>largest){
            largest = array[idx];
        }
        return smallestAndLargest(array,idx+1,smallest,largest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[8];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        int[] ans = SmallestAndLargestByIterative(Array);
        int[] ansByrecusrsion = SmallestAndLargestByRecursive(Array);
        System.out.println("Smaller element And Largest element in Array respectively using iterative approach is : "+ans[0]+","+ans[1]);
        System.out.println("Smaller element And Largest element in Array respectively using recursive approach is : "+ansByrecusrsion[0]+","+ansByrecusrsion[1]);
    }
}
