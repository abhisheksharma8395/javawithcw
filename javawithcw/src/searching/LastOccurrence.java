package searching;

import java.util.Scanner;

public class LastOccurrence {
    public static int lastOccurrence(int[] array, int target,int first,int last,int lastoccurrence) {
        if (first>last) {
            return lastoccurrence;
        }
        int mid = first + (last-first)/2;
        if (array[mid] == target) {
            return lastOccurrence(array, target, mid+1, last, mid);
        } else if (array[mid]>target) {
            return lastOccurrence(array,target,first,mid-1,lastoccurrence);
        }
        return lastOccurrence(array, target, mid+1,last,lastoccurrence);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(lastOccurrence(array, target, 0,array.length-1,-1));
    }
}
