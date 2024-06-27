package recursion;

import java.util.Scanner;

public class PrintNTo1 {
    public static void Nto1(int n){
        if(n==1){                       //Base Case
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");         // Self Work
        Nto1(n-1);                    // Recursive Case
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Nto1(n);

    }
}
