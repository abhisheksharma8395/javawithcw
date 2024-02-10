package linked_list;

public class nth_element_from_last_with_head_only {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void NthNodeFromLast(Node head,int idx){
        int size=0;
        Node temp=head;
        while(temp!=null) {
            size++;
            temp=temp.next;
        }
        temp=head;
        int p=((size-idx)+1);
        for (int i = 1; i <=p ; i++) {
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public static void NthNodeFromLast2(Node head,int val){
        Node slow=head;
        Node fast=head;
        for (int i = 1; i < val; i++) {
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        System.out.println(slow.data);
    }
    public static Node deleteAtnthindexfromLast(Node head,int val){
        Node slow=head;
        Node fast=head;
        for (int i = 1; i <=val ; i++) {
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        else{
            while(fast.next!=null){
                fast=fast.next;
                slow=slow.next;
            }
            slow.next=slow.next.next;
            return head;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(6);
        Node c=new Node(3);
        Node d=new Node(10);
        Node e=new Node(2);
        Node f=new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        display(a);
        //NthNodeFromLast(a,2);
        //NthNodeFromLast2(a,5);
        a=deleteAtnthindexfromLast(a,1);
        display(a);
    }
}
