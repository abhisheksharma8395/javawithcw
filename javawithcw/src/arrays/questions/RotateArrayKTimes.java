package arrays.questions;

import java.util.Scanner;

public class RotateArrayKTimes {
    public static void RotationWithoutExtraSpace(int[] array,int k){
        int n = array.length;
        k = k%n;
        reverse(array,0,n-1);
        reverse(array,0,k-1);
        reverse(array,k,n-1);
        for(int i : array){
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }
    public static void reverse(int[] array,int first,int last){
        while(first<last){
            int temp = array[first];
            array[first]=array[last];
            array[last]=temp;
            first++;
            last--;
        }
    }
    public static void RotateArray(int[] array,int k) {
        int n = array.length;
        k = k%n;
        int j=0;
        int[] arr = new int[array.length];
        for (int i = n-k; i < n; i++) {
            arr[j++]=array[i];
        }
        for (int i = 0; i < n-k ; i++) {
            arr[j++]=array[i];
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
        int K = sc.nextInt();
        System.out.print(K+" Times rotated array in O(3n) with extra space : ");
        RotateArray(Array,K);
        System.out.print(K+" Times rotated array in O(3n) without extra space : ");
        RotationWithoutExtraSpace(Array,K);
    }
}
