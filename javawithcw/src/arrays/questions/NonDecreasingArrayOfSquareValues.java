package arrays.questions;

import java.util.Scanner;

public class NonDecreasingArrayOfSquareValues {
    public static void Swap(int[] array,int a, int b) {
        int temp = (int) Math.pow(array[a],2);
        array[a] = (int) Math.pow(array[b],2);
        array[b] = temp;
    }

    public static void SortArrayOfSquareValues(int[] array) {
        int n = array.length;
        int[] arr = new int[n];
        int j = n-1;
        int left = 0;
        int right = n-1;
        while(left<=right) {
            if (Math.pow(array[left],2)>Math.pow(array[right],2)) {
                arr[j--]= (int) Math.pow(array[left],2);
                left++;
            }
            else{
                arr[j--]= (int) Math.pow(array[right],2);
                right--;
            }
        }
        for (int i : arr) {
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
        System.out.println("Array of squares of each number sorted in non decreasing order : ");
        SortArrayOfSquareValues(Array);
    }
}
