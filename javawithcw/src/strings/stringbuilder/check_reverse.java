package strings.stringbuilder;

import java.util.Scanner;

public class check_reverse {
    public static boolean check(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.next();
        System.out.println(check(s));
    }
}
