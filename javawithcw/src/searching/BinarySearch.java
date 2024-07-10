package searching;

import java.util.Scanner;

public class BinarySearch {
    public static boolean BinarySearchIteratively(int[] array, int target) {
        int first = 0;
        int last = array.length-1;
        while(first<=last){
           int mid = first + (last - first)/2;
           if(array[mid]==target){
               return true;
           }
           else if(array[mid]>target){
               last = mid-1;
           }
           else{
               first = mid+1;
           }
        }
        return false;
    }

    public static boolean BinarySearchRecursively(int[] array, int target,int first,int last) {
        if (first>last) {
            return false;
        }
        int mid = first + (last-first)/2;
        if (array[mid] == target) {
            return true;
        } else if (array[mid]>target) {
            return BinarySearchRecursively(array,target,first,mid-1);
        }
        return BinarySearchRecursively(array, target, mid+1,last);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(BinarySearchIteratively(array, target));
        System.out.println(BinarySearchRecursively(array, target, 0,array.length-1));
    }
}
