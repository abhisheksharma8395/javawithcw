package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static boolean BinarySearchRecursion(int[] Array, int first, int last, int target) {
        if (first > last) {
            return false;
        }
        int mid = first + (last - first) / 2;
        if (Array[mid] == target) {
            return true;
        } else if (Array[mid] > target) {
            last = mid - 1;
        } else {
            first = mid + 1;
        }
        return BinarySearchRecursion(Array, first, last, target);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int target = scanner.nextInt();
        System.out.println(BinarySearchRecursion(arr, 0, arr.length - 1, target));
    }
}
