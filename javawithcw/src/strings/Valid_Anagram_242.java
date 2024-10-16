package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Valid_Anagram_242 {
    public static boolean Anagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];
        int[] arr1 = new int[26];
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            char ch1 = t.charAt(i);
            int index = ch - 97;
            int index1 = ch1 - 97;
            arr[index]++;
            arr1[index1]++;
            i++;
        }
        return Arrays.equals(arr, arr1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(Anagram(s,t));

    }
}
