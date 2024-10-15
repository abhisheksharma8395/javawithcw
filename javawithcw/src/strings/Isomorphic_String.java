package strings;

import java.util.HashMap;
import java.util.Scanner;

public class Isomorphic_String {
    public static boolean Isomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> h1 = new HashMap<>();
        HashMap<Character, Character> h2 = new HashMap<>();
        int i = 0;
        while(i<s.length()){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i);
            if(h1.containsKey(ch1)){
                if(h1.get(ch1)!=ch2){
                    return false;
                }
            }
            else{
                h1.put(ch1,ch2);
            }
            if(h2.containsKey(ch2)){
                if(h2.get(ch2)!=ch1){
                    return false;
                }
            }
            else{
                h2.put(ch2,ch1);
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(Isomorphic(s,t));
    }
}
