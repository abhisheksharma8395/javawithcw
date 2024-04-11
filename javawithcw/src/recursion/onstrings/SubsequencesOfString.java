package recursion.onstrings;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsequencesOfString {
    ArrayList<String> sq = new ArrayList<>();
    public static ArrayList<String> ssq(String s){
        ArrayList<String> sq = new ArrayList<>();
        if(s.isEmpty()){
            sq.add(" ");
            return sq;
        }
        char a = s.charAt(0);
        ArrayList<String> smallAnswer = ssq(s.substring(1));
        for (String ss:smallAnswer){
            sq.add(ss);
            sq.add(a+ss);
        }
        return sq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> subsequence = ssq(s);
        for(String i:subsequence){
            System.out.println(i);
        }
    }
}
