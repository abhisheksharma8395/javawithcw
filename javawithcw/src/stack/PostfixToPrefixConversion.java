package stack;

import java.util.Stack;

public class PostfixToPrefixConversion {
    public static void main(String[] args) {
        String s="953+4*6/-";
        Stack<String> val=new Stack<>();
        for (int i = 0; i <s.length(); i++) {
            char ch=s.charAt(i);
            if((int)ch>=48 && (int)ch<=57){   //filling integer from string s to stack val
                String t=""+ch;
                val.push(t);
            } else if (ch=='+'||ch=='-'||ch=='*'||ch=='/') {
                String a=val.pop();
                String b=val.pop();
                String p=ch+b+a;
                val.push(p);
            }
        }
        System.out.println(val.peek());
    }
}
