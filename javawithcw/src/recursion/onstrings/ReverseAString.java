package recursion.onstrings;
import java.util.Scanner;
public class ReverseAString {
    public static String reverse(String s){
        if(s.isEmpty()){
            return "";
        }
        return reverse(s.substring(1))+s.charAt(0);
        //time complexity = total number of calls * total time taken in one call
        //time complexity = n * n
        //time complexity = O(n^2)
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String p = reverse(s);
        if(p.equals(s)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
