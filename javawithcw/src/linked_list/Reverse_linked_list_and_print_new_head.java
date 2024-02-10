package linked_list;
public class Reverse_linked_list_and_print_new_head {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public static Node reverse(Node head){
        if(head.next==null) return head;
        Node newhead1=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newhead1;
    }
    public static void display(Node head){
        if(head==null){
            System.out.println("");
        }
        else{
            System.out.print(head.data+" ");
            display(head.next);
        }
    }
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(2);
        Node d=new Node(6);
        Node e=new Node(7);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        a=reverse(a);
        display(a);

    }
}
