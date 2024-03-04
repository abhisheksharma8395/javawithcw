package stack;

import java.util.Stack;

public class PrefixImplementation {
    public static void main(String[] args) {
        String infix="9-(5+3)*4/6";
        Stack<String> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        for (int i = 0; i <infix.length(); i++) {
            char ch= infix.charAt(i);
            if((int) ch >=48 && (int) ch <=57){
                String s=""+ch;
                val.push(s);
            }
            else if(op.size()==0 || op.peek()=='(' || ch=='('){
                op.push(ch);
            } else if (ch==')') {
                while(op.peek()!='('){
                    String a=val.pop();
                    String b=val.pop();
                    char o=op.pop();
                    String t=b+a+o;
                    val.push(t);
                }
                op.pop();
            } else{
                if(ch=='+' || ch=='-'){
                    String a=val.pop();
                    String b=val.pop();
                    char o=op.pop();
                    String t=b+a+o;
                    val.push(t);
                    op.push(ch);
                } else if (ch=='/' || ch=='*') {
                    if (op.peek()=='*' ||op.peek()=='/'){
                        String a=val.pop();
                        String b=val.pop();
                        char o=op.pop();
                        String t=b+a+o;
                        val.push(t);
                        op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }

            }
        }
        while(val.size()>1){
            String a=val.pop();
            String b=val.pop();
            char o=op.pop();
            String t=b+a+o;
            val.push(t);
        }
        System.out.println(val.peek());
    }
}
