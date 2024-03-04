package stack;

import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        String s="953+4*6/-";
        Stack<Integer> val=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if((int) ch>=48 && (int) ch<=57){
                val.push((int) ch-48);
            } else if (ch=='+'||ch=='-'||ch=='*'||ch=='/') {
                int var2=val.pop();
                int var1=val.pop();
                if(ch=='+') val.push(var1+var2);
                else if(ch=='-') val.push(var1-var2);
                else if(ch=='*') val.push(var1*var2);
                else if(ch=='/') val.push(var1/var2);
            }
        }
        System.out.println(val.peek());
    }
}
