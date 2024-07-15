package searching;

import java.util.Scanner;

public class PeakIndex {
    public static int peakIndex(int[] array) {
        int first = 0;
        int last = array.length - 1;
        int ans = -1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (array[mid] < array[mid + 1]) {
                ans = mid + 1;
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(peakIndex(array));
    }
}
