//find total number of pairs whose sum is exactly equal to sum
package arrays.questions;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static int TwoSumRecursion(int[] array, int target) {
        int count = 0;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            count += recursionHelper(array, target, i + 1, Math.abs(array[i] - target));
        }
        return count;

    }

    public static int pairsIterative(int[] array, int target) {
        int numbersOfPairs = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] + array[j]) == target) {
                    numbersOfPairs += 1;
                }
            }
        }
        return numbersOfPairs;
    }

    public static int pairsIterativeLessTimeComplexityy(int[] array, int target) {
        Arrays.sort(array);
        int NoOfPairs = 0;
        int first = 0;
        int last = array.length - 1;
        while (first < last) {
            if ((array[first] + array[last]) == target) {
                NoOfPairs += 1;
                first++;
                last--;
            } else if ((array[first] + array[last]) > target) {
                last--;
            } else if ((array[first] + array[last]) < target) {
                first++;
            }
        }
        return NoOfPairs;
    }

    public static int pairBinarySearch(int[] array, int target) {
        int n = array.length;
        Arrays.sort(array);
        int pairs = 0;
        for (int i = 0; i < n - 1; i++) {
            int required = Math.abs(array[i] - target);
            pairs = pairs + BinarySearch(array, required, i + 1, n - 1);
        }
        return pairs;
    }

    public static int BinarySearch(int[] array, int required, int first, int last) {
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (array[mid] == required) {
                return 1;
            } else if (array[mid] > required) {
                last = mid - 1;
            } else if (array[mid] < required) {
                first = mid + 1;
            }
        }
        return 0;
    }

    public static int recursionHelper(int[] array, int target, int StartingIdx, int required) {  //Helper function of TwoSumRecursion function
        if (StartingIdx >= array.length) {
            return 0;
        }
        if (array[StartingIdx] == required) {
            return 1;
        }
        return recursionHelper(array, target, StartingIdx + 1, required);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[6];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println("By iterative method O(n^2) : " + pairsIterative(Array, target));
        System.out.println("By sorting and two pointer O(nlogn) : " + pairsIterativeLessTimeComplexityy(Array, target));
        System.out.println("By Binary Search O(nlogn) : " + pairBinarySearch(Array, target));
        System.out.println("By Recursion O(n^2) : " + TwoSumRecursion(Array, target));
    }
}
