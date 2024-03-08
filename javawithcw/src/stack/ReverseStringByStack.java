package stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringByStack {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Stack<Character> st=new Stack<>();
        System.out.println("Enter your String");
        String a=sc.next();
        int idx=0;
        while(idx<a.length()){
            char ch=a.charAt(idx);
            st.push(ch);
            idx++;
        }
        StringBuilder str= new StringBuilder();
        while(st.size()!=0){
            str.append(st.pop());
        }
        System.out.println("Reversed String is "+str);
    }
}
