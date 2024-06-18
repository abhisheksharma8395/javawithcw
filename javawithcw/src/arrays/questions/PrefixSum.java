package arrays.questions;

import java.util.Scanner;

public class PrefixSum {
    public static void PrefixSumArray(int[] array) {
        int n = array.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += array[j];
            }
            arr[i] = sum;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static void PrefixSumArrayInLessTimeCOmplexity(int[] array) {
        int n = array.length;
        int[] arr = new int[n];
        arr[0] = array[0];
        for (int i = 1; i < n; i++) {
            arr[i] = array[i]+arr[i-1];
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static void PrefixSumArrayInLessTimeCOmplexityWithoutExtraSpace(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            array[i] = array[i]+array[i-1];
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
        System.out.println("Prefix Sum Array in O(n^2) is : ");
        PrefixSumArray(Array);
        System.out.println("Prefix Sum Array in O(2n) is : ");
        PrefixSumArrayInLessTimeCOmplexity(Array);
        System.out.println("Prefix Sum Array in O(2n) Without Extra Space is : ");
        PrefixSumArrayInLessTimeCOmplexityWithoutExtraSpace(Array);
    }
}
