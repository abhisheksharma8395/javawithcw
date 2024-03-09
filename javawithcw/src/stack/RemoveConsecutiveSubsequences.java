package stack;

import java.util.Stack;

public class RemoveConsecutiveSubsequences {
    public static int[] resultant(int[] myarr){
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < myarr.length ; i++) {
            if(st.size()==0){
                st.push(myarr[i]);
            }
            else if(st.peek()!=myarr[i]){
                st.push(myarr[i]);
            }
        }
        int l=st.size();
        int[] myarr1=new int[l];
        for (int i = l-1; i >=0 ; i--) {
            myarr1[i]=st.pop();
        }
        return myarr1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,4,5,6,8,8,8,8,9};
        int[] res = resultant(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }
}
