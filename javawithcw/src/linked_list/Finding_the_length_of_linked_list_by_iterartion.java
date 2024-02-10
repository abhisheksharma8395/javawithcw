package linked_list;

public class Finding_the_length_of_linked_list_by_iterartion {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int length(Node head){
        int count=0;
        Node temp=head;
        while(temp!=null){     //iteration method to find the length of linked list
            count++;
            temp=temp.next;
        }
        return count;
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
        System.out.println("The Length of Linked List is");
        System.out.println(length(a));
    }
}
