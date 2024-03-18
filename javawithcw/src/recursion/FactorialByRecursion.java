package recursion;

import java.util.Scanner;

public class FactorialByRecursion {
    public static int factorial(int n){
        int p=1;
        if(n==1){
            return 1;
        }
        p=p*n*factorial(n-1);
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(factorial(n));
    }
}
