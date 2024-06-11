package arrays.questions;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfAllElementOfAnArray {
    public static int SumOfElement(int[] array,int idx){
        int n = array.length;
        if(idx==n){
            return 0;
        }
        return array[idx]+SumOfElement(array,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[5];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i : Array) {
            sum = sum+ i;
        }
        System.out.println("Sum using for loop : "+sum); //time complexity O(n)
        System.out.println("Sum using recursion : "+SumOfElement(Array,0)); //time complexity O(n)
        System.out.println("Sum using stream API : "+ Arrays.stream(Array).sum()); //time complexity O(1)

    }
}
