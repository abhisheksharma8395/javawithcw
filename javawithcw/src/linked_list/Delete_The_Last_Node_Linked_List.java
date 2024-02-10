package linked_list;
import java.util.Scanner;
public class Delete_The_Last_Node_Linked_List {
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public static class Linked_List{
        Node head=null;
        Node tail=null;
        void enterElement(int val){
            Node temp=new Node(val);
            if(head==null){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        void deleteAtLAst(){
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        void deleteThatIndexFromlast(int val){
            Node fast=head;
            Node slow=head;
            for (int i = 1; i <=val; i++) {
                fast=fast.next;
            }
            while(fast.next!=null){
                slow=slow.next;
                fast=fast.next;
            }
            slow.next=slow.next.next;
        }
    }

    public static void main(String[] args) {
        Linked_List ll= new Linked_List();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in linked list");
        int n=sc.nextInt();
        while(n!=0){
            ll.enterElement(sc.nextInt());
            n--;
        }
        ll.display();
        System.out.println("enter the element number from last you want to delete");
        //ll.deleteAtLAst();
        ll.deleteThatIndexFromlast(sc.nextInt());
        ll.display();
    }
}
