package recursion;

import java.util.Scanner;

public class LinearSearchByRecursion {
    private static boolean linearsearch(int[]arr,int target,int idx){
        //Base Case
        if(idx == arr.length){
            return false;
        }
        //Selfwork
        if (arr[idx] == target){
            return true;
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
        if(linearsearch(arr,target,0)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
