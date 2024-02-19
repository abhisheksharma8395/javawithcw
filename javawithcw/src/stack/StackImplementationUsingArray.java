package stack;
public class StackImplementationUsingArray {
    public static class Stack{
        int[] myarr=new int[5];
        int idx=0;
        void push(int val){
            myarr[idx]=val;
            idx++;
        }
        int peek(){
            if(idx==0) {
                return -1;
            }
            return myarr[idx-1];
        }
        int pop(){
            if(idx==0) {
                return -1;
            }
            int top=myarr[idx-1];
            myarr[idx-1]=0;
            idx--;
            return top;
        }
        void display(){
            for (int i = 0; i < idx; i++) {
                System.out.print(myarr[i]+" ");
            }
            System.out.println("");
        }
        int size(){
            return idx;
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.pop();
        System.out.println(st.peek()); //7
        st.display();   //4 5 6 7
        System.out.println(st.size());  //4
    }
}
