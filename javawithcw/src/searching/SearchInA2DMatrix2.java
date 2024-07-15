package searching;

import java.util.Scanner;

public class SearchInA2DMatrix2 {
    public static boolean SearchIn2DMatrix2(int[][] array,int target){
        int n = array.length;
        int i = 0 ;
        int j = array[0].length-1;
        while (i<n && j>0){
            if(array[i][j]==target){
                return true;
            } else if (array[i][j]>target) {
                j--;
            }
            else{
                i++;
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
