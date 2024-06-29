package recursion;

import java.util.Scanner;

public class SumOfTheArrayByUsingRecursion {
    private static int SumOfArray(int[] arr, int idx) {
        if (idx == arr.length - 1) {    // Base Case
            return arr[idx];
        }
        return arr[idx] + SumOfArray(arr, idx + 1);  // Self Work + Recursive Work
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(SumOfArray(arr, 0));
    }
}
