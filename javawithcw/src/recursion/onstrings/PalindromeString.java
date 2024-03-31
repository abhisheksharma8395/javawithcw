package recursion.onstrings;

import java.util.Scanner;

public class PalindromeString {
    private static boolean palindrome(String s) {
        if (s.isEmpty() || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) != (s.charAt(s.length() - 1))) {
            return false;
        }
        return palindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(palindrome(s));
    }

}
