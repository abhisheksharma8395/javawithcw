package Bit_Manipulation;

import java.util.BitSet;
import java.util.Scanner;

public class setTheBit {
    public static int setBit(int n, int bit) {
        return n | (1 << bit);
    }

    public static boolean BitIsSet(int num,int bit) {
        return (num & (1<<bit)) != 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bit = sc.nextInt();
        System.out.println(BitIsSet(n,bit));
        System.out.println(setBit(n,bit));
    }
}
