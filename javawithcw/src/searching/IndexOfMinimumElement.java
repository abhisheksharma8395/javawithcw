package searching;

import java.util.Scanner;

public class IndexOfMinimumElement {
    public static int IndexMinimumElement(int[] array,int first,int last,int ans) {
        if (first>last) {
            return ans;
        }
        int mid = first + (last-first)/2;
        if (array[mid] <= array[array.length-1]) {   // 3 4 5 1 2 is rotated array if mid is at 2 index value = 5 which is greater than 2
            return IndexMinimumElement(array,first,mid-1,mid); // than first = mid+1 now mid comes out 3 value = 1 1<2 ans updates its value to 1
        }                                                       // last = mid-1 first index = 3 last index =2 loop breaks ans return
        return IndexMinimumElement(array, mid+1,last,ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(IndexMinimumElement(array, 0,array.length-1,-1));
    }
}
