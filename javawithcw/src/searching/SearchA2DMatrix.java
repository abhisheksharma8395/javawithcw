package searching;

import java.util.Scanner;

public class SearchA2DMatrix {
    public static boolean SearchIn2DMatrix(int[][] array,int target){
        int n = array.length;
        int m = array[0].length;
        int low =0 ;
        int high = (n * m)-1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if(array[mid/m][mid%m]==target){
                return true;
            } else if (array[mid/m][mid%m]>target) {
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
        int[][] Array = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(SearchIn2DMatrix(Array,3));

    }
}
