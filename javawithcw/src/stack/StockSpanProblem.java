package stack;
import java.util.Stack;
public class StockSpanProblem {
    public static int[] ssp(int[] myarr){
        Stack<Integer> st =new Stack<>();
        int[] myarr2=new int[myarr.length];
        myarr2[0]=1;
        st.push(0);
        for (int i = 1; i < myarr.length; i++) {
            if(myarr[i]<=myarr[st.peek()]){
                myarr2[i]=1;
                st.push(i);
            }
            else if(myarr[i]>myarr[st.peek()]){
                while(st.size()>0 && myarr[i]>myarr[st.peek()]){
                    st.pop();
                }
                if(st.size()==0){
                    myarr2[i]=i+1;
                }
                else{
                    myarr2[i]=i-st.peek();
                }
                st.push(i);
            }
        }
        return myarr2;
    }
    public static void main(String[] args) {
        int[] arr1= {100,80,60,70,60,75,85,75};
        int[] arr2= ssp(arr1);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+",");
        }
    }
}
