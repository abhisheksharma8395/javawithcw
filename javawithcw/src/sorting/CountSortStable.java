package sorting;

import java.util.Scanner;

public class CountSortStable {
    public static int maxElement(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public static void CountSortStable(int[] array) {
        int max = maxElement(array);
        int[] count = new int[max + 1];
        int[] ans = new int[array.length];
        for (int i : array) {
            count[i]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }
        for (int i = array.length - 1; i >= 0; i--) {
            ans[count[array[i]]-1]=array[i];
            count[array[i]]--;
        }
        Display(ans);
    }
    public static void Display(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        CountSortStable(array);
    }
}
