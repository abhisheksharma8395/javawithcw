package linked_list;

public class all_operation_of_Linked_List {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linked_list{
        Node head=null;
        Node tail=null;
        void insertatbeginningwtihHeadandTail(int val){
            Node temp=new Node(val);
            if(head==null){
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
        void InsertAtTailwithHeadOnly(Node head,int val){
            Node t=new Node(val);
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=t;
        }
        void insertAtEndWithHeadAndTail(int val){
            Node t=new Node(val);
            if(head==null){
                head=tail=t;
            }
            else{
                tail.next=t;
                tail=t;
            }
        }
        void InsertAtIndex(int idx,int val){
            Node temp=new Node(val);
            Node t=head;
            if(idx<0 || idx>size()){
                System.out.println("Enter valid index");
            }
            else if(idx==0){
                insertatbeginningwtihHeadandTail(val);
            }
            else if (idx==size()) {
                insertAtEndWithHeadAndTail(val);
            }
            else{
                for (int i = 1; i <=idx-1; i++) {
                    t=t.next;
                }
                temp.next=t.next;
                t.next=temp;
            }
        }
        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }

        void getAt(int idx){
            Node temp=head;
            for (int i = 1; i <=idx; i++) {
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println(" ");
        }
        void deleteAt(int idx){
            Node temp=head;
            for (int i = 1; i <=idx-1; i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }
    public static void main(String[] args) {
        linked_list ll1=new linked_list();
        ll1.insertatbeginningwtihHeadandTail(4);
        ll1.insertatbeginningwtihHeadandTail(17);
        ll1.insertAtEndWithHeadAndTail(2);
        ll1.insertAtEndWithHeadAndTail(6);
        ll1.insertatbeginningwtihHeadandTail(9);
        ll1.insertAtEndWithHeadAndTail(5);
        ll1.display();
        ll1.getAt(0);
        System.out.println(ll1.size());
        ll1.InsertAtIndex(4,11);
        ll1.deleteAt(3);
        ll1.display();

    }
}
