package recursion;

import java.util.Scanner;

public class PrintTheIndecesTargetOccurs {
    private static void findallindeces(int[] arr,int target,int idx){
        if(idx==arr.length){
            return;
        }
        if(arr[idx]==target){
            System.out.print(idx+" ");
        }
        findallindeces(arr,target,idx+1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        findallindeces(arr,target,0);
    }
}
