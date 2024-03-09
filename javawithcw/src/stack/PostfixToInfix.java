package stack;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String a="953+4*6/-";
        Stack<String> st=new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            char ch=a.charAt(i);
            if((int)ch>=48 && (int)ch<=57){
                String b=""+ch;
                st.push(b);
            }
            else{
                String val2=st.pop();
                String val1=st.pop();
                st.push("("+(val1+ch+val2)+")");
            }
        }
        System.out.println(st.peek());
    }
}
