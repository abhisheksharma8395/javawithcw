package stack;

import java.util.Stack;

public class Basics_Of_Stacks {

    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st.peek());
        System.out.println(st);
    }
}
