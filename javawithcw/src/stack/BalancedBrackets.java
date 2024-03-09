package stack;

import java.util.Stack;

public class BalancedBrackets {
    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='[' ||ch=='{'||ch=='('){
                st.push(ch);
            }
            else if(ch==']' ||ch=='}'||ch==')'){
                if(st.size()==0) return false;
                else{
                    if(st.peek()=='(' && ch==')'){
                        st.pop();
                    }
                    else if(st.peek()=='{' && ch=='}'){
                        st.pop();
                    }
                    else if(st.peek()=='[' && ch==']'){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return st.size()==0;
    }

    public static void main(String[] args) {
        String a="[{()}]";
        if(isValid(a)){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
    }
}
