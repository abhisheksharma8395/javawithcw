package strings;

import java.util.Scanner;

public class Find_The_Index_of_first_Occurence_in_A_String_28 {
    public static int strStr(String haystack, String needle) {
        int l1 = haystack.length();
        int l2 = needle.length();
        if(l2>l1){
            return -1;
        }
        for(int i = 0; i<= (l1-l2) ; i++){
            if(needle.equals(haystack.substring(i,i+l2))){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(strStr(a, b));
    }
}
