package recursion;

import java.util.Scanner;

public class Print1ToN {
    public static void Increase(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        Increase(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Increase(n);
    }
}
