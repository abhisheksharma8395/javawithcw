//Search the given Element x in the Array if present then return the index else return -1
package arrays.questions;


import java.util.*;

public class FindingElementInArray {

    public static int LinearSearchRecursive(int[] array,int idx,int target){
        int n = array.length;
        if(idx==n){
            return -1;
        }
        if(array[idx]==target){
            return idx;
        }
        return LinearSearchRecursive(array,idx+1,target);
    }
    public static int BinarySearchRecursive(int[] array,int target,int first,int last){
        int mid = first + (last-first)/2;
        if(first>=last){
            return -1;
        }
        if(array[mid]==target){
            return mid;
        }
        if(array[mid]>target){
            return BinarySearchRecursive(array,target,first,mid-1);
        }
        return BinarySearchRecursive(array,target,mid+1,last);
    }
    public static int LinearSearchIterative(int[] array,int target){
        int n = array.length;
        for(int i=0;i<n;i++){
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int BinarySearchIterative(int[] array,int target){
        int first = 0;
        int last = array.length-1;
        while(first<=last){
            int mid = first + (last-first)/2;
            if(array[mid]==target){
                return mid;
            }
            else if(array[mid]<target){
                first=mid+1;
            }
            else if(array[mid]>target){
                last=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[5];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(Array);

        System.out.println("index of element using Linear Search iterative : "+LinearSearchIterative(Array,target)); //time complexity O(n)
        System.out.println("index of element using Binary Search iterative : "+BinarySearchIterative(Array,target)); //time complexity O(logn)
        System.out.println("index of element using Linear Search recursive : "+LinearSearchRecursive(Array,0,target)); //time complexity O(n)
        System.out.println("index of element using Linear Search recursive : "+BinarySearchRecursive(Array,target,0, Array.length-1)); //time complexity O(logn)
    }
}
