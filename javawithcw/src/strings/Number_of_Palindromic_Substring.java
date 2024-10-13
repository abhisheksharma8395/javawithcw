// return the number of total substring that are palindrome in string
package strings;

import java.util.Scanner;

public class Number_of_Palindromic_Substring {
    public static boolean Palindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        int count = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i+1; j <= l ; j++) {
                if(Palindrome(s.substring(i,j))){
                    count++;
                    System.out.print(s.substring(i,j)+" ");
                }
            }
        }
        System.out.println(" ");

        System.out.println(count);
    }

}
