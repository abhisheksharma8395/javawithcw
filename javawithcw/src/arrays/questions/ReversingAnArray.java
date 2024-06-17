package arrays.questions;

import java.util.Scanner;

public class ReversingAnArray {
    public static void ReversedArray(int[] array) {
        int[] arr = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            arr[array.length - 1 - i] = array[i];
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }
    public static void ReversedArrayWithoutNewArray(int[] array){
        int n = array.length-1;
        for (int i = 0; i < n/2; i++) {
            int temp = array[i];
            array[i]=array[n-i];
            array[n-i]=temp;
        }
        for (int i : array) {
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
        System.out.println("The Reversed Array in O(2n) : ");
        ReversedArray(Array);
        System.out.println("The Reversed Array in O(2n) : ");
        ReversedArrayWithoutNewArray(Array);
    }
}
