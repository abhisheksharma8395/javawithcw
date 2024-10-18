package strings.stringbuilder;

import java.util.Scanner;

public class String_to_Integer_AtoI_8 {
    public static int AtoI(String s){
        int total = 0;
        String ans = s.trim();
        int sign = 1;
        int start = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        if(ans.charAt(0) == '-'){
            sign = -1;
            start = 1;
        }
        for (int i = start; i < ans.length(); i++) {
            char ch = ans.charAt(i);
            if(ch =='+' && i==0){
                continue;
            }
            else if(ch>='0' && ch<='9'){
                int digit = ch -'0';
                if(total > (max-digit)/10){
                    return sign == 1 ? max:min;
                }
                total = total*10 + digit;
            }
            else{
                break;
            }
        }
        return total*sign;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int val = AtoI(s);
        System.out.println(val);
    }
}
