package recursion.onstrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubsequencesOfString {
    public static ArrayList<String> SubSequences(String s){
        ArrayList<String> ans = new ArrayList<>();
        if(s.isEmpty()){
            ans.add("");
            return ans;
        }
        char ch = s.charAt(0);
        ArrayList<String> small = SubSequences(s.substring(1));
        for (String i : small){
            ans.add(i);
            ans.add(ch+i);
        }
        return ans;
    }
    public static void Subsequences(String s,String small){
        if(s.isEmpty()){
            System.out.println(small);
            return;
        }
        String rest = s.substring(1);
        Subsequences(rest,s.charAt(0)+small);
        Subsequences(rest,small);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> subsequence = SubSequences(s);
//        Collections.sort(subsequence);
        for(String i:subsequence){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        Subsequences(s,"");
    }
}
