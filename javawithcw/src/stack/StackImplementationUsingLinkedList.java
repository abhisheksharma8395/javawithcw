package stack;

public class StackImplementationUsingLinkedList {
    public static class StackNode {
        int data;
        StackNode next;

        public StackNode(int data) {
            this.data = data;
        }
    }

    public static class Stack {
        StackNode top = null;
        int size = 0;

        void push(int val) {
            StackNode temp = new StackNode(val);
            if (top == null) top = temp;
            else {
                temp.next = top;
                top = temp;
            }
            size++;
        }

        int peek() {
            if (top == null) return -1;
            return top.data;
        }

        int pop() {
            if (top == null) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int k = top.data;
            top = top.next;
            size--;
            return k;

        }
        int size(){
            return size;
        }
        private void display(){
            StackNode temp=top;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println(" ");
        }

        private boolean isEmpty() {
            return top == null;
        }

    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        //st.pop();
        System.out.println(st.peek()); //7
        st.display();   //4 5 6 7
        System.out.println(st.size());  //4
        System.out.println(st.isEmpty());   //false
    }
}
