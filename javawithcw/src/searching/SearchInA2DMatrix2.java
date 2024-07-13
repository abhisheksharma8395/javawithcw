package searching;

import java.util.Scanner;

public class SearchInA2DMatrix2 {
    public static boolean SearchIn2DMatrix2(int[][] array,int target){
        int n = array.length;
        int m = array[0].length;
        int low =0 ;
        int high = (n * m)-1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if(array[mid%m][mid/m]==target){
                return true;
            } else if (array[mid%m][mid/m]>target) {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] Array = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(SearchIn2DMatrix2(Array,5));

    }
}
