package recursion;

import java.util.Scanner;

public class FibonacciSeries {        //recursive way
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static int fibonacciDp(int n) {     //Using DP
        if(n==0 || n==1) return n;
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2;i<n+1;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
    public static int fibonacciIterative(int n) {
        if(n==0 || n==1) return n;
        int prev = 0;
        int current = 1;
        int next = 0;
        for(int i = 2;i<=n;i++){
            next = prev + current;
            prev = current;
            current = next;
        }
        return next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fibonacci(n)+" ");
        System.out.print(fibonacciDp(n)+" ");
        System.out.print(fibonacciIterative(n)+" ");

    }
}
