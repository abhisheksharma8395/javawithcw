package strings.stringbuilder;

import java.util.*;

import static java.lang.Character.*;


public class Toggle_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder toggle = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(isLowerCase(ch)){
                toggle.append(toUpperCase(ch));
            }
            else{
                toggle.append(toLowerCase(ch));
            }
        }
        System.out.println(toggle);
    }
}
