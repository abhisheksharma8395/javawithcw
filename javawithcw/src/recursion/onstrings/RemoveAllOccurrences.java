package recursion.onstrings;

import java.util.Scanner;

public class RemoveAllOccurrences {
    //que-remove all the occurrences of a from string abcax
    public static String removeOccurrence2(String s, char remove) {
        if(s.length()==0){
            return "";
        }
        char current = s.charAt(0);
        String SmallAns = removeOccurrence2(s.substring(1),remove);
        if(current==remove){
            return current+SmallAns;
        }
        return SmallAns;
    }

    public static String removeOccurrence(String s, char remove, int idx) {
        if(idx==s.length()){
            return "";
        }
        char current = s.charAt(idx);
        String SmallAns = removeOccurrence(s,remove,idx+1);
        if(current!=remove){
            return current+SmallAns;
        }
        return SmallAns;

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
