package strings;

import java.util.Scanner;

public class StringsBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Jai";
        System.out.println(s); // it prints Jai Shree Ram
        String S = sc.nextLine(); // hello
        System.out.println(S); // prints hello
        System.out.println(s.length()); //prints 13
        System.out.println(S.length()); // print 5
        System.out.println(s.charAt(2)); // print h
        System.out.println(S.compareTo(s)); // prints any  integer
    }
}
