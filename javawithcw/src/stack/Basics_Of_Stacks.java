package stack;

import java.util.Stack;

public class Basics_Of_Stacks {

    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println(st.size());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Size of stack is "+st.size());  //it print 5
        System.out.println(st.peek()); //it prints 5
        System.out.println(st); //it prints [1,2,3,4,5]
        st.pop();        // it remove 5 from top of stack;
        System.out.println(st);   //[1,2,3,4]
        st.pop();              //it removes 4 from the top of stack
        System.out.println(st); //[1,2,3]
        System.out.println("Size of stack is "+st.size());  //it print 3
        while(st.size()>2){
            st.pop();
        }
        System.out.println(st);   //[1,2]
    }
}
