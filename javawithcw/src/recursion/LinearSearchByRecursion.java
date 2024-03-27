package recursion;

import java.util.Scanner;

public class LinearSearchByRecursion {
    private static int linearsearch(int[]arr,int target,int idx){
        //Base Case
        if(idx == arr.length){
            return -1;
        }
        //Selfwork
        if (arr[idx] == target){
            return idx;
        }
        //Subproblem
        return linearsearch(arr,target,idx+1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        System.out.println(linearsearch(arr,target,0));
    }
}
