package arrays.questions;

import java.util.Arrays;
import java.util.Scanner;

public class LastValueRepeatInArray {
    public static int LastRepeat(int[] array) {
        int lastrepeat = Integer.MIN_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    lastrepeat = array[i];
                    break;
                }
            }
        }
        return lastrepeat;
    }

    public static int LastRepeatInLessTimeComplexity(int[] array) {
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            if (BinarySearch(array, array[i], i - 1, 0)) {
                return array[i];
            }
        }
        return -1;
    }

    public static boolean BinarySearch(int[] array, int target, int first, int last) {
        while (last <= first) {
            int mid = last + (first - last) / 2;
            if (array[mid] == target) {
                return true;
            } else if (array[mid] > target) {
                first = mid - 1;
            } else {
                last = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Array = new int[n];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        System.out.println("Last repeat Element in the array in O(n^2) : " + LastRepeat(Array));
        System.out.println("Last repeat Element in the array in O(nlogn) (necessary is input array is sorted) : " + LastRepeatInLessTimeComplexity(Array)); //it is necessary for this to array should be is sorted
    }
}
