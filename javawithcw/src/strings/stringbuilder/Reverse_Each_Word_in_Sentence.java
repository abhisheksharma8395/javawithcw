//input - "I am an educator
//output - " I ma na rotacude
package strings.stringbuilder;
import java.util.Scanner;

public class Reverse_Each_Word_in_Sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder ans = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i==s.length()-1) {
                word.append(s.charAt(i));
                ans.append(word.reverse());
                word.delete(0, word.length());
            } else if(s.charAt(i)!=' '){
                word.append(s.charAt(i));
            }
            else{
                ans.append(word.reverse());
                word.delete(0,word.length());
                ans.append(" ");
            }
        }
        System.out.println(ans);
    }
}
