package stack;

import java.util.Stack;

public class PrefixEvaluation {
    public static void main(String[] args) {
        String s="-9/*+5346";
        Stack<Integer> val=new Stack<>();
        for (int i = s.length()-1; i >=0; i--) {
            char ch=s.charAt(i);
            if((int) ch>=48 && (int) ch<=57){
                val.push((int) ch-48);
            } else if (ch=='+'||ch=='-'||ch=='*'||ch=='/') {
                int var1=val.pop();
                int var2 =val.pop();
                if(ch=='+') val.push(var1+var2);
                else if(ch=='-') val.push(var1-var2);
                else if(ch=='*') val.push(var1*var2);
                else val.push(var1/var2);
            }
        }
        System.out.println(val.peek());
    }
}
