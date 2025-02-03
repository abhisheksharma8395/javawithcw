package Bit_Manipulation;

import java.util.Scanner;

public class BinaryToDecimal {
    public static int Decimal(String str){
        int pow = 0;
        int total = 0;
        for (int i = str.length()-1; i >= 0 ; i--) {
            char ch = str.charAt(i);
            total = total + (ch-'0')*(int)Math.pow(2,pow);
            pow++;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Decimal(str));
    }
}
