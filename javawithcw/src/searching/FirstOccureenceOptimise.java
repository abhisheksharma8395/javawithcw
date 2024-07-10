package searching;

import java.util.Scanner;

public class FirstOccureenceOptimise {
    public static int BinarySearchRecursively(int[] array, int target,int first,int last,int firstOccurence) {
        if (first>last) {
            return firstOccurence;
        }
        int mid = first + (last-first)/2;
        if (array[mid] == target) {
            return BinarySearchRecursively(array,target,first,mid-1,mid);
        } else if (array[mid]>target) {
            return BinarySearchRecursively(array,target,first,mid-1,firstOccurence);
        }
        return BinarySearchRecursively(array, target, mid+1,last,firstOccurence);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(BinarySearchRecursively(array, target, 0,array.length-1,-1));
    }
}
