package stack;

import java.util.Scanner;
import java.util.Stack;

public class DeleteFromBottomOfStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        Stack <Integer> st1=new Stack<>();
        System.out.println("Enter the Number of element you want in a stack");
        int n;
        n=sc.nextInt();
        System.out.println("Enter the element :");
        while(n>0){
            st.push(sc.nextInt());
            n--;
        }
        System.out.println(st);
        while(st.size()>1){
            st1.push(st.pop());

        }
        st.pop();
        while(st1.size()>0){
            st.push(st1.pop());
        }
        System.out.println(st);
    }
}

