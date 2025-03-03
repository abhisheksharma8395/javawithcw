package Bit_Manipulation;

import java.util.Scanner;

public class bitIsSetOrNot {
    public static boolean bitIsSetLeftShift(int a,int b){
        return ((a & (1<<b)) != 0);
    }
    public static boolean bitIsSetRightShift(int a,int b){
        return ((1 & (a>>b)) != 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(bitIsSetLeftShift(a,b));
        System.out.println(bitIsSetRightShift(a,b));
    }
}
