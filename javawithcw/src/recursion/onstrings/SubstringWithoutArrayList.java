package recursion.onstrings;

import java.util.Scanner;

public class SubstringWithoutArrayList {
    public static void SSQ(String s, String currentAnswer) {
        if (s.isEmpty()) {
            System.out.println(currentAnswer);
            return;
        }
        char current = s.charAt(0);
        SSQ(s.substring(1), currentAnswer + current);
        SSQ(s.substring(1), currentAnswer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        SSQ(s, "");
    }
}
