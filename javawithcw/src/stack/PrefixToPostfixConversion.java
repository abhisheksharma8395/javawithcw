package stack;

import java.util.Stack;

public class PrefixToPostfixConversion {
    public static void main(String[] args) {
        String s="-9/*+5346";
        Stack<String> val=new Stack<>();
        for (int i = s.length()-1; i >=0; i--) {
            char ch=s.charAt(i);
            if((int)ch>=48 && (int)ch<=57){   //filling integer from string s to stack val
                String t=""+ch;
                val.push(t);
            } else if (ch=='+'||ch=='-'||ch=='*'||ch=='/') {
                String a=val.pop();
                String b=val.pop();
                String p=a+b+ ch;
                val.push(p);
            }
        }
        System.out.println(val.peek());
    }
}
