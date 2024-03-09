package stack;

import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        String str="-9/*+5346";
        Stack<String> st=new Stack<>();
        for (int i = str.length()-1; i >=0; i--) {
            char ch=str.charAt(i);
            if((int)ch>=48 && (int)ch<=57){
                String t=""+ch;
                st.push(t);
            }
            else{
                String val1=st.pop();
                String val2=st.pop();
                st.push("("+(val1+ch+val2)+")");
            }
        }
        System.out.println(st.peek());
    }
}
