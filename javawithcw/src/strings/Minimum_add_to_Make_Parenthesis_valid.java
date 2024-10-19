package strings;

import java.util.Scanner;

public class Minimum_add_to_Make_Parenthesis_valid {
    public static int minAddToMakeValid(String s) {
        int open_requirred = 0;
        int close_requirred = 0;
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                open_requirred++;
            }
            else{
                open_requirred--;
                if(open_requirred < 0){
                    close_requirred++;
                    open_requirred = 0;
                }
            }
        }
        return open_requirred + close_requirred;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int val = minAddToMakeValid(s);
        System.out.println(val);
    }

}
