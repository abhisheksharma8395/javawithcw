package searching;

import java.util.Scanner;

public class LinearSearch {
    public static boolean LinearSearchIteratively(int[] array, int target) {
        for (int i : array) {
            if (target == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean LinearSearchRecursively(int[] array, int target, int idx) {
        if (idx == array.length) {
            return false;
        }
        if (array[idx] == target) {
            return true;
        }
        return LinearSearchRecursively(array, target, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(LinearSearchIteratively(array, target));
        System.out.println(LinearSearchRecursively(array, target, 0));
    }
}
