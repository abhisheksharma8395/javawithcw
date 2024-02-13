package stack;

import java.util.Scanner;
import java.util.Stack;

public class Copy_Stack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        int n;
        System.out.println("Enter The Number Of Elements you want in Stack");
        n=sc.nextInt();
        while(n>0){
            st.push(sc.nextInt());
            n--;
        }
        System.out.println("Your Stack : "+st);
        while(st.size()>0){
            st1.push(st.peek());
            st.pop();
        }
        System.out.println("Copied Stack in reverse order : "+st1);
        while(st1.size()>0){
            st2.push(st1.peek());
            st1.pop();
        }
        System.out.println("Copied stack in same order :"+st2);
        while(st2.size()>0){
            st.push(st2.peek());
            st2.pop();
        }
        System.out.println("Same stack with reverse values :"+st);
    }
}
