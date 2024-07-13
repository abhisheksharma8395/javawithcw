package searching;

import java.util.Scanner;

public class SearchingInRotatedSortedArray {
    public static int searchInRotatedSortedArray(int[] array,int target){
        int min = minElementIndex(array);
        int firstPart = BSearch(array,target,0,min-1);
        int secondPart = BSearch(array,target,min,array.length-1);
        if(firstPart!=-1){
            return firstPart;
        } else if (secondPart!=-1) {
            return secondPart;
        }
        else{
            return -1;
        }
    }
    public static int minElementIndex(int[] array){
        int first = 0;
        int last = array.length;
        int ans = -1;
        while(first<=last){
            int mid = first + (last-first)/2;
            if(array[mid] > array[array.length-1]){
                first = mid+1;
            }
            else {
                last = mid-1;
                ans = mid;
            }
        }
        return ans;
    }
    public static int BSearch(int[] array,int target,int first,int last){
        while(first<=last){
            int mid = first + (last-first)/2;
            if(array[mid] == target){
                return mid;
            }
            else if(array[mid] > target){
                last = mid-1;
            }
            else {
                first = mid+1;
            }
        }
        return -1;
    }
    public static int SearchinOnetraversal(int[] array,int target){
        int first = 0;
        int last = array.length-1;
        while(first<=last){
            int mid = first + (last - first)/2;
            if(array[mid]==target){
                return mid;
            }
            if(array[mid]<array[last]){                       // 10 11 12 1 2 3 4 5 6 7 8 9
                if(target>array[mid] && target<=array[last]){ // 0  1  2  3 4 5 6 7 8 9 10 11
                    first = mid+1;
                }
                else{
                    last = mid-1;
                }
            }
            else{
                if(target>=array[first] && target<array[mid]){
                    last = mid-1;
                }
                else{
                    first  = mid+1;
                }
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
        int target = sc.nextInt();
        System.out.println(searchInRotatedSortedArray(array,target));
        System.out.println(SearchinOnetraversal(array,target));
    }
}
