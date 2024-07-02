package recursion;

import java.util.Scanner;
//Given a String containning digit 2-9, return all possible letter combination that the
// number could represent.Return the answer in any order
public class AllPossibleLetterCombinationThatTheNumberCouldRepresent {
    private static void possibleCombination(String digit, String res, String[] mapping) {
        if(digit.isEmpty()){
            System.out.println(res);
            return;
        }
        int num = digit.charAt(0)-'0';
        for (int i = 0; i < mapping[num].length(); i++) {
            possibleCombination(digit.substring(1),res+mapping[num].charAt(i),mapping);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        possibleCombination(s, "", mapping);
    }
}

