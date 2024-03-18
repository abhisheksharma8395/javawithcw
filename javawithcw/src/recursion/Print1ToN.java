package recursion;

import java.util.Scanner;

public class Print1ToN {
    public static void Increase(int n){
        if(n==1){                      //BASE CASE
            System.out.println(1);
            return;
        }
        Increase(n-1);              //Solving Smaller Problem
        System.out.println(n);         //Self Work
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Increase(n);
    }
}
