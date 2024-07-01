package recursion.onstrings;
import java.util.Scanner;
public class PalindromeString {
    private static boolean palindrome(String s,int left,int right) {
        if(left>=right){         // Base Case
            return true;
        }
        if(s.charAt(left)!=s.charAt(right)){  // Self Work
            return false;
        }
        return palindrome(s,left+1,right-1);  // Recursive Work
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(palindrome(s,0,s.length()-1));
    }

}
