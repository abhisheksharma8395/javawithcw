package recursion;

import java.util.Scanner;

public class PrintNTo1 {
    public static void Nto1(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        Nto1(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Nto1(n);

    }
}
