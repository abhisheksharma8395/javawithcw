package Bit_Manipulation;

import java.util.Scanner;

public class RemoveRightMostBit {
    public static int DeleteRightMostBit(int num){
        return num & num-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(DeleteRightMostBit(n));
    }
}
