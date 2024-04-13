package recursion.onstrings;

import java.util.Scanner;

public class SumOfAllSubsets {
    private static void SumOfSubsets(int[] arr, int sum, int idx) {
        if (idx >= arr.length) {
            System.out.print(sum+" ");
            return;
        }
        int num = arr[idx];
        SumOfSubsets(arr, sum + num, idx + 1);        //include
        SumOfSubsets(arr, sum, idx + 1);                   //exclude
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] myarr = new int[n];
        for (int i = 0; i < n; i++) {
            myarr[i] = sc.nextInt();
        }
        SumOfSubsets(myarr, 0, 0);
    }
}