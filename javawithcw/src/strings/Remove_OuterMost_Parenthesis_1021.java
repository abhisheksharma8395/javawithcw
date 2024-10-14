package strings;

import java.util.Scanner;

public class Remove_OuterMost_Parenthesis_1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder ans = new StringBuilder();
        StringBuilder helper = new StringBuilder();
        int i = 0;
        int ob = 0; //count open bracket
        while(i<s.length()){
            if (s.charAt(i)=='(') {
                ob++;
                helper.append(s.charAt(i));
            }
            else{
                helper.append(s.charAt(i));
                ob--;
            }
            if(ob==0){
                helper.deleteCharAt(0);
                helper.deleteCharAt(helper.length()-1);
                ans.append(helper);
                helper.delete(0,helper.length());
            }
            i++;
        }
        System.out.println(ans.toString());
     }
}
