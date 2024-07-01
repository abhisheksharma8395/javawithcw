package recursion;

import java.util.Scanner;

//    There are N stones, numbered 0,1,2,…,N-1. For each i (0 ≤ i≤ N-1),
//    the height of Stone i is hi. There is
//    a frog who is initially on Stone 0. It will repeat the following action
//    some number of times to reach Stone N-1:
//    If the frog is currently on stone i, jump to stone i + 1 or Stone i + 2.
//    Here, a cost of |h[i] - h[j]| is incurred, where j is the stone to land on
//    Find the minimum possible total cost incurred before the frog reaches Stone N-1.
public class FrogProblem {
    private static int frogProblem(int[] arr, int idx) {
        if (idx == arr.length-1) return 0;    //if frog is already on n-1 stone then no cost is requirred to go on n-1 stone
        int ans = Math.abs(arr[idx]-arr[idx+1])+frogProblem(arr, idx + 1);
        if (idx==arr.length-2) return ans;    //if frog is on n-2 stone then he/she needs to be take a single stone jump
        int ans1 =Math.abs(arr[idx]-arr[idx+2])+ frogProblem(arr, idx + 2);
        return Math.min(ans,ans1);
    }

    public static int Frog(int[] array,int idx,int sum){
        if(idx == array.length-1){
            return sum;
        }
        if(idx == array.length-2){
            return sum+Frog(array, idx+1,sum+Math.abs(array[idx+1]-array[idx]));
        }
        return Math.min(Frog(array,idx+1,sum+Math.abs(array[idx+1]-array[idx])), Frog(array,idx+2,sum+Math.abs(array[idx+2]-array[idx])));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] myarr = new int[n];
        for (int i = 0; i < n; i++) {
            myarr[i] = sc.nextInt();
        }
        System.out.println(frogProblem(myarr,0));
        System.out.println(Frog(myarr,0,0));
    }
}
