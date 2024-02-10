package linked_list;

public class Displaying_Linked_list_using_While_loop { //if we only have value of head
    public static class Node{                   //don't know the length of linked list
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(5);     //Head node
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        Node e=new Node(16);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node temp=a;
        while(temp!=null){    // because tail node stores null at address
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
}
