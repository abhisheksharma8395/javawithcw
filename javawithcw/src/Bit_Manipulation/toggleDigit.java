package Bit_Manipulation;

import java.util.Scanner;

public class toggleDigit {
    public static int ToggleDigit(int num,int bit) {
        return num ^ (1 << bit);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bit = sc.nextInt();
        System.out.println(n);
        System.out.println(ToggleDigit(n,bit));

    }
}
