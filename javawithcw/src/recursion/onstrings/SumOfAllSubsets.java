package recursion.onstrings;

import java.util.Scanner;

public class SumOfAllSubsets {
    public static void SumOfArraySubsets(int[] array,int idx,int sum){
        if(idx== array.length){
            System.out.println(sum+" ");
            return;
        }
        SumOfArraySubsets(array,idx+1,sum);
        SumOfArraySubsets(array,idx+1,sum+array[idx]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] myarr = new int[n];
        for (int i = 0; i < n; i++) {
            myarr[i] = sc.nextInt();
        }
        SumOfArraySubsets(myarr, 0, 0);
    }
}
