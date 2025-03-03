package arrays.questions;

import java.util.Scanner;

public class sumOfSubArrayRanges {
    public static int sumOfSubArrays(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] > max){
                    max = arr[j];
                }
                else if(arr[j] < min){
                    min = arr[j];
                }
                sum = sum + max-min;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sumOfSubArrays(arr);
        System.out.println("The sum of the subarrays of the given array is " + sum);
    }
}
