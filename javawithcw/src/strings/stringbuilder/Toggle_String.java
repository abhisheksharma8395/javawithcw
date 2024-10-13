package strings.stringbuilder;

import java.util.*;

import static java.lang.Character.*;


public class Toggle_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder toggle = new StringBuilder(sc.nextLine());
        for (int i = 0; i < toggle.length(); i++) {
            char ch = toggle.charAt(i);
            if(isLowerCase(ch)){
                toggle.setCharAt(i,toUpperCase(ch));
            } else if (ch==' ') {
                continue;
            } else{
                toggle.setCharAt(i,toLowerCase(ch));
            }
        }
        System.out.println(toggle);
    }
}
