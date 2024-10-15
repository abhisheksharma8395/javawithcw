//water is blue -> blue is water
package strings.stringbuilder;

import java.util.Scanner;

public class Reverse_Word_In_A_String_151 {
    public static String reverse_each(String s) {
        String trim = s.trim().replaceAll("\\s+", " ");
        String rev = new StringBuilder(trim).reverse().toString();
        StringBuilder ans = new StringBuilder();
        StringBuilder helper = new StringBuilder();
        int i = 0;
        while (i < rev.length()) {
            char ch = rev.charAt(i);
            if(ch != ' '){
                helper.append(ch);
            }
            else{
                ans.append(helper.reverse());
                ans.append(" ");
                helper.delete(0,helper.length());
            }
            i++;
        }
        ans.append(helper.reverse());
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse_each(s));

    }
}
