package stack;

import java.util.Scanner;
import java.util.Stack;

public class DeleteFromAnyIndexOfStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        int n;
        System.out.println("Please Enter the Number Of Element You Wanna be to Store :");
        n=sc.nextInt();
        System.out.println("Enter Elements :");
        while(n>0){
            st1.push(sc.nextInt());
            n--;
        }
        System.out.println("The Original Stack "+st1);
        int x;
        System.out.println("Enter the index :");
        x=sc.nextInt();
        while(st1.size()>(x+1)){
            st2.push(st1.peek());
            st1.pop();
        }
        st1.pop();
        while(st2.size()>0){
            st1.push(st2.peek());
            st2.pop();
        }
        System.out.println("The Updated Stack "+st1);

    }
}

