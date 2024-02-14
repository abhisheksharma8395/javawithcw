package stack;

import java.util.Scanner;
import java.util.Stack;

public class Display_Stack_Using_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter the Number of element you want in a stack");
        int n;
         n = sc.nextInt();
        int p=n;
        System.out.println("Enter the element :");
        while (p > 0) {
            st.push(sc.nextInt());
            p--;
        }
        System.out.println(st);
        int[] myarr = new int[st.size()];
        for (int i = (n - 1); i >= 0; i--) {
            myarr[i] = st.pop();
        }
        for (int j=0; j <n; j++) {
            System.out.print(myarr[j]+" ");
            st.push(myarr[j]);
        }
        System.out.println(" ");
        System.out.println(st);

    }
}
