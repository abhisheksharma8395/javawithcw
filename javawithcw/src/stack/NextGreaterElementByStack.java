package stack;

import java.util.Stack;

public class NextGreaterElementByStack {
    public static int[] NgeByStack(int[] myarr){
        Stack<Integer> st=new Stack<>();
        int[] myarr2=new int[myarr.length];
        myarr2[myarr.length-1]=-1;
        st.push(myarr[myarr.length-1]);
        for (int i = myarr.length-2; i >=0; i--) {
            if(st.peek()>myarr[i]){
                 myarr2[i]=st.peek();
                 st.push(myarr[i]);
            }
            else{
                while(!st.isEmpty() && st.peek()<=myarr[i]){
                    st.pop();
                }
                if(st.size()==0){
                    myarr2[i]=-1;
                }
                else{
                    myarr2[i]=st.peek();
                }
                st.push(myarr[i]);
            }
        }
        return myarr2;
    }
    public static void main(String[] args) {
        int[] arr1={1,6,4,8,9,3,6,7};
        int[] res=NgeByStack(arr1);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+",");
        }
    }
}
