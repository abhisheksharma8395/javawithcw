package arrays.questions;

import java.util.Scanner;

public class SortArrayConatainingOnly0And1 {
    public static void SortArray(int[] array){
        int[] arr = new int[array.length];
        int countZ = 0;
        int j =0;
        for(int i : array){
            if(i==0){
                countZ++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(i<countZ){
                arr[j++]=0;
            }
            else{
                arr[j++]=1;
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
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
        System.out.println("The Array that containing 0's and 1's only in sorted order is : " );
        SortArray(Array);
    }
}
