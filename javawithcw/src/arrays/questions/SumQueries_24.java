package arrays.questions;

import java.util.Scanner;

public class SumQueries_24 {

    public static void PrefixSumArrayInLessTimeComplexityWithoutExtraSpace(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            array[i] = array[i]+array[i-1];
        }
    }
    public static void AnsOfQueries(int[] array,int first,int last) {
        if(first>1){
            System.out.println(array[last-1]-array[first-2]);
        } else {
            System.out.println(array[last-1]);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Array = new int[n];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        PrefixSumArrayInLessTimeComplexityWithoutExtraSpace(Array);
        while(q-->0){
            System.out.println("Enter The first and last index up to which you want sum :");
            int first = sc.nextInt();
            int last = sc.nextInt();
            AnsOfQueries(Array,first,last);
        }
    }
}
