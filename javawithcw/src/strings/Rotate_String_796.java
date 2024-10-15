package strings;

import java.util.Scanner;

public class Rotate_String_796 {
    public static boolean Rotate_String(String s,String rots){
        if(s.length()!=rots.length()){
            return false;
        }
        String[] arr = new String[s.length()];
        StringBuilder helper = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            helper.append(s.substring(i+1));
            helper.append(s.substring(0,i+1));
            arr[i] = helper.toString();
            helper.delete(0,helper.length());
        }
        for (String string : arr) {
            if (rots.equals(string)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // original string
        String rots = sc.next(); // rotated string
        System.out.println(Rotate_String(s,rots));
    }
}
