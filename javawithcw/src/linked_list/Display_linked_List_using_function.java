package linked_list;

public class Display_linked_List_using_function {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void displayr(Node head){  //using recursion it print the element
        if(head==null) return;
        System.out.print(head.data+" ");
        displayr(head.next);
    }
    public static void displayrr(Node head){   //using recursion it print the element in reverse
        if(head==null) return;
        displayrr(head.next);
        System.out.print(head.data+" ");
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        Node e=new Node(16);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
        System.out.println("");
        displayr(a);
        System.out.println("");
        displayrr(a);
    }
}
