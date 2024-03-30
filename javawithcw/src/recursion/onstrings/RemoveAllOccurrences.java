package recursion.onstrings;
import java.util.Scanner;
public class RemoveAllOccurrences {
    //que-remove all the occurrences of a from string abcax
    public static String removeOccurrence2(String s,char remove){
        String a = "";
        if(s.isEmpty()){
            return a;
        }
        char currentCharacter = s.charAt(0);
        if(currentCharacter != remove){
            a+=currentCharacter;
        }
        String smallAns = removeOccurrence2(s.substring(1),remove);
        return a+smallAns;
    }
    public static String removeOccurrence(String s,char remove,int idx){
        String a = "";
        if(idx == s.length()){          //Base Case
            return a;
        }
        char currentCharacter = s.charAt(idx);
        if(currentCharacter != remove){       //Self Work
            a=a+currentCharacter;
        }
        String small = removeOccurrence(s,remove,idx+1);  //Subproblem
        return a + small;                           //Self Work + Subproblem
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char remove = scanner.next().charAt(0);
        System.out.println(removeOccurrence(s,remove,0));
        System.out.println(removeOccurrence2(s,remove));
    }
}
