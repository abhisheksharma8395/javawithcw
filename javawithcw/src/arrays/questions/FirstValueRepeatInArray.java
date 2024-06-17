package arrays.questions;
import java.util.Arrays;
import java.util.Scanner;

public class FirstValueRepeatInArray {
    public static int FirstRepeat(int[] array) {
        for (int i=0;i < array.length-1;i++) {
            for (int j = i+1; j < array.length ; j++) {
                if(array[i]==array[j]){
                    return array[i];
                }
            }
        }
        return -1;
    }
    public static int FirstRepeatInLessTimeComplexity(int[] array){
        int n = array.length;
        Arrays.sort(array);
        for (int i = 0; i < n-1; i++) {
            if(BinarySearch(array,array[i],i+1, array.length-1)){
                return array[i];
            }
        }
        return -1;
    }

    public static boolean BinarySearch(int[] array,int target,int first,int last) {
        while(first<=last){
            int mid=first+(last-first)/2;
            if(array[mid]==target){
                return true;
            }
            else if(array[mid]>target){
                last=mid-1;
            }
            else{
                first = mid+1;
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
        System.out.println("Second Largest Element in the array in O(n^2) : " + FirstRepeat(Array));
        System.out.println("Second Largest Element in the array in O(nlogn) : " + FirstRepeatInLessTimeComplexity(Array)); //it is necessary for this to array should be is sorted
    }
}
