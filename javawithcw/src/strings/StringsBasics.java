package strings;

import java.util.Scanner;

public class StringsBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "zebra";
        System.out.println(s); // it prints Jai Shree Ram
        String S = sc.nextLine(); // hello
        System.out.println(S); // prints hello
        System.out.println(s.length()); //prints 13
        System.out.println(S.length()); // print 5
        System.out.println(s.charAt(2)); // print h
        System.out.println(S.compareTo(s)); // prints any  integer
        System.out.println(S.startsWith("a",0)); // print true iff string starts with a
        System.out.println(S.contains("br")); // print true if string contains br atleast one time as substring
        System.out.println(s.toLowerCase()); //print zebra
        System.out.println(S.toUpperCase()); // print ZEBRA
        String r = "Hello,";
        String t = "World!";
        String results = r.concat(t);
        System.out.println(results); //prints Hello,World!
    }
}
