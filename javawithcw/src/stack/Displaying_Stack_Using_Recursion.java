package stack;

import java.util.Scanner;
import java.util.Stack;

public class Displaying_Stack_Using_Recursion {
    public static void display_recursively(Stack<Integer> st1) {
        if(st1.size()==0) return;
        int x = st1.pop();
        System.out.print(x+" ");
        display_recursively(st1);
        st1.push(x);
    }
    public static void display_recursively_inSameOrder(Stack<Integer> st2) {
        if(st2.size()==0) return;
        int x = st2.pop();
        display_recursively(st2);
        System.out.print(x+" ");
        st2.push(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter the Number of element you want in a stack");
        int n;
        n = sc.nextInt();
        int p = n;
        System.out.println("Enter the element :");
        while (p > 0) {
            st.push(sc.nextInt());
            p--;
        }
        display_recursively(st);
        System.out.println(" ");
        display_recursively_inSameOrder(st);
    }
}
