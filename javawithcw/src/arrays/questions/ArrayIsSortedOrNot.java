package arrays.questions;

import java.util.Scanner;

public class ArrayIsSortedOrNot {
    public static boolean IsSortedIteratively(int[] array){
        for(int i=1;i<array.length;i++){
            if(array[i]<array[i-1]){
                return false;
            }
        }
        return true;
    }
    public static boolean IsSortedRecursively(int[] array,int idx){
        if(idx>array.length-2){
            return true;
        }
        if(array[idx+1]<array[idx]){
            return false;
        }
        return IsSortedRecursively(array,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[8];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        System.out.println("Array is Sorted by using iterative method : "+IsSortedIteratively(Array)); //time complexity is O(n)
        System.out.println("Array is Sorted by using recursive method : "+IsSortedRecursively(Array,0)); //time complexity is O(n)
        //Two pointer approach can minimize time complexity for O(n/2)
    }
}
