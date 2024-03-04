package stack;

import java.util.Stack;

public class infixNotation {
    public static void main(String[] args) {
        String st="9-(5+3)*4/6";
        Stack<Integer> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        for (int i = 0; i <st.length(); i++) {
            char ch= st.charAt(i);
            if((int) ch >=48 && (int) ch <=57){
                val.push((int) ch -48);
            }
            else if(op.size()==0 || op.peek()=='(' || ch=='('){
                op.push(ch);
            } else if (ch==')') {
                while(op.peek()!='('){
                    int val8=val.pop();
                    int val7=val.pop();
                    if(op.peek()=='-'){
                        val.push(val7-val8);
                    }
                    else if(op.peek()=='+'){
                        val.push(val7+val8);
                    }
                    else if(op.peek()=='*'){
                        val.push(val7*val8);
                    }
                    else if(op.peek()=='/'){
                        val.push(val7/val8);
                    }
                    op.pop();
                }
                op.pop();
            } else{
                if(ch=='+' || ch=='-'){
                    int val2 = val.pop();
                    int val1 = val.pop();
                    if(op.peek()=='-'){
                        val.push(val1-val2);
                    }
                    else if(op.peek()=='+'){
                        val.push(val1+val2);
                    }
                    else if(op.peek()=='*'){
                        val.push(val1*val2);
                    }
                    else if(op.peek()=='/'){
                        val.push(val1/val2);
                    }
                    op.pop();
                    op.push(ch);
                } else if (ch=='/' || ch=='*') {
                    if (op.peek()=='*' ||op.peek()=='/'){
                        int val4=val.pop();
                        int val3=val.pop();
                        if(op.peek()=='*'){
                            val.push(val3*val4);
                        }
                        else if(op.peek()=='/'){
                            val.push(val3/val4);
                        }
                        op.pop();
                        op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }

            }
        }
        while(val.size()>1){
            int val6=val.pop();
            int val5=val.pop();
            if(op.peek()=='-'){
                val.push(val5-val6);
            }
            else if(op.peek()=='+'){
                val.push(val5+val6);
            }
            else if(op.peek()=='*'){
                val.push(val5*val6);
            }
            else if(op.peek()=='/'){
                val.push(val5/val6);
            }
            op.pop();
        }
        System.out.println(val.peek());
    }
}
