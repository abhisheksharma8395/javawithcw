package searching;

import java.util.Scanner;

public class PeakElement {
    public static int peakElement(int[] array) {
        int n = array.length;
        int first = 0;
        int last = array.length - 1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if((mid==0 || array[mid]>array[mid-1]) && (mid==n-1 || array[mid]>array[mid+1])){
                return mid;
            }
            else if (array[mid] < array[mid + 1]) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(peakElement(array));
    }
}
