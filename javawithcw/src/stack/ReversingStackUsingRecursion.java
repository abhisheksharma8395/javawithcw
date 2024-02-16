package stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReversingStackUsingRecursion {
    public static void pushatbottom(Stack<Integer> st, int val) {
        if(st.size()==0) st.push(val); //1.for 4 it directly stores the value
        else {                         //2.for 3 x=4 and then store the value of 3 when stack st is null 3->4
            int x = st.pop();          //3.for 2 the calling stack of pushatbottom(st,2) is 4->3 and then store the value of 2 when stack st is null so st become 2->3->4
            pushatbottom(st, val);     //3.for 1 the calling stack of pushatbottom(st,1) is 4->3->2 and then store the value of 1 when stack st is null so st become 1->2->3->4
            st.push(x);
        }
    }

    public static void reverse(Stack<Integer> st) {
        if (st.size() == 1) return;
        int x = st.pop();
        reverse(st);            // calling stack is 4->3->2->1
        pushatbottom(st, x);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        System.out.println("The Original Stack " + st1);
        reverse(st1);
        System.out.println("The Reverse Stack " + st1);
    }
}
