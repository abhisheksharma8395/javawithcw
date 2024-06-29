package recursion.onstrings;
import java.util.Scanner;
public class ReverseAString {
    public static String reverse(String s){
        if(s.isEmpty()){
            return "";
        }
        char current = s.charAt(0);
        String small = reverse(s.substring(1));
        return  small+current;
        //time complexity = total number of calls * total time taken in one call
        //time complexity = n * n
        //time complexity = O(n^2)
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String p = reverse(s);
        System.out.println(p);
    }
}
