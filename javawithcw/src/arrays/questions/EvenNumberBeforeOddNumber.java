package arrays.questions;

import java.util.Scanner;

public class EvenNumberBeforeOddNumber {
    public static void Swap(int[] array,int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void SortArrayInEvenOddOrder(int[] array) {
        int left = 0;
        int right = array.length-1;
        while(left<right){
            while(left<right && array[left]%2==0){
                left++;
            }
            while(left<right && array[right]%2!=0){
                right--;
            }
            if(left<right){
                Swap(array,left,right);
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
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
        System.out.println("Sorting Array in the manner so that Even number comes before odd order ");
        SortArrayInEvenOddOrder(Array);
    }
}
