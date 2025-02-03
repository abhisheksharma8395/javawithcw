package Bit_Manipulation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DecimalToBinary {
    public static String Binary(int n) {
        StringBuilder binary = new StringBuilder();
        while(n!=1){
            binary.append(n%2);
            n/=2;
        }
        binary.append(1);
        return binary.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Binary(n));
    }
}
