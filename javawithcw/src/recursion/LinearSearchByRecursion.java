package recursion;

import java.util.Scanner;

public class LinearSearchByRecursion {
    private static int LinearSearch(int[] arr, int target, int idx) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == target) {
            return idx;
        }
        return LinearSearch(arr, target, idx + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        System.out.println(LinearSearch(arr, target, 0));
    }
}
