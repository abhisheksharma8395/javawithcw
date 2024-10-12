package strings;

import java.util.Scanner;

public class Substring {
    public static void substring(int fi,int li,String s){
        String[] array = new String[li-fi];
        int i =0;
        while(fi<li){
            array[i] = s.substring(fi,li);
            i++;
            li--;
        }
        for (String string : array) {
            System.out.println(string);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            substring(i,s.length(),s);
        }
    }
}
