package Bit_Manipulation;

import java.util.Scanner;

public class OnesCompliment {
    public static String Binary(int n) {
        StringBuilder binary = new StringBuilder();
        while(n!=1){
            binary.append(n%2);
            n/=2;
        }
        binary.append(1);
        return binary.reverse().toString();
    }
    public static String flip(String s){
        StringBuilder result = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c=='0'){
                result.append("1");
            }
            else if(c=='1'){
                result.append("0");
            }
        }
        return result.toString();
    }
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
    public static int onesCompliment(int n){
        String binary = Binary(n);
        String flip = flip(binary);
        return Decimal(flip);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(onesCompliment(n));
    }
}
