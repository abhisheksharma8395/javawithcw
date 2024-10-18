package strings.stringbuilder;

import java.util.Scanner;

public class Maximum_Depth_Of_Parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int max = 0;
        int current = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                current++;
                if(max<current){
                    max = current;
                }
            }
            else if(ch==')'){
                current--;
            }
        }
        System.out.println(max);
    }
}
