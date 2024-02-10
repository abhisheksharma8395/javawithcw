package doubly_linked_list;

public class Initialisation {
    public static class Node {
        Node previous;   //null
        int data;
        Node next;  //null

        public Node(int data) {
            this.data = data;
        }
    }
    public static Node insertAthead(int val,Node head){
        Node a=new Node(val);
        a.next=head;
        head.previous=a;
        head=a;
        return head;
    }
    public static Node insertAttail(int val,Node head){
        Node a=new Node(val);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=a;
        a.previous=temp;
        return head;
    }
    public static Node deleteAtindex(int val,Node head){
        Node temp=head;
        if(head==null) return null;
        if(val==0){
            head=head.next;
            head.previous=null;
        }
        else{
            for (int i = 0; i < val-1; i++) {
                temp=temp.next;
            }
            if(temp.next.next==null){
                temp.next=null;
            }
            else {
                temp.next = temp.next.next;
                temp.next.previous = temp;
            }
        }
        return head;
    }
    public static Node insertAtindex(Node head,int idx,int number){
        Node temp=head;
        Node a=new Node(number);
        for (int i = 0; i <idx-1 ; i++) {
            temp=temp.next;
        }
        a.next=temp.next;
        temp.next.previous=a;
        temp.next=a;
        a.previous=temp;
        return head;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }
    public static void display2(Node tail){
        Node temp1=tail;
        while(temp1!=null){
            System.out.print(temp1.data+" ");
            temp1=temp1.previous;
        }
        System.out.println("");
    }
    public static void display3(Node random){
        Node current=random;
        while(current.previous!=null){
            current=current.previous;
        }
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(6);
        Node c=new Node(7);
        Node d=new Node(8);
        Node e=new Node(9);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        b.previous=a;
        c.previous=b;
        d.previous=c;
        e.previous=d;
        a=insertAtindex(a,3,50);
        a=insertAthead(3,a);
        a=insertAttail(78,a);
        //a=deleteAtindex(7,a);

        display(a);



    }
}
