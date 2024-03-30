package recursion.onstrings;

import java.util.Scanner;

public class RemoveAllOccurrences {
    //que-remove all the occurrences of a from string abcax
    public static String removeOccurrence2(String s, char remove) {
        if (s.isEmpty()) {
            return "";
        }
        String smallAns = removeOccurrence2(s.substring(1), remove);
        char currentCharacter = s.charAt(0);      //time complexity = no of calls * total time taken in one call
        if (currentCharacter != remove) {         // time complexity = length of string + 1 * total time taken in one call
            return currentCharacter+smallAns;                // time complexity = n * n
        }                                         // time complexity = O(n^2)
        else{
            return smallAns;                      //String concatenation is of O(n) time complexity
        }
    }

    public static String removeOccurrence(String s, char remove, int idx) {
        if (idx == s.length()) {          //Base Case
            return "";
        }
        String small = removeOccurrence(s, remove, idx + 1);  //SubProblem
        char currentCharacter = s.charAt(idx);
        if (currentCharacter != remove) {       //Self Work
            return currentCharacter + small;
        } else {
            return small;                            //Self Work + SubProblem
        }
        //time complexity = no of calls * total time taken in one call
        // time complexity = length of string + 1 * total time taken in one call
        // time complexity = n * n
        // time complexity = O(n^2)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char remove = scanner.next().charAt(0);
        System.out.println(removeOccurrence(s, remove, 0));
        System.out.println(removeOccurrence2(s, remove));
    }
}
