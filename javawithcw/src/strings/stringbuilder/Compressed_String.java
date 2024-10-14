package strings.stringbuilder;

import java.util.Scanner;

public class Compressed_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            int count = 1;
            i++;
            while (i<s.length() && s.charAt(i) == ch) {
                i++;
                count++;
            }
            ans.append(ch);
            if (count > 1) {
                ans.append(count);
            }
        }
        System.out.println(ans);
    }
}
