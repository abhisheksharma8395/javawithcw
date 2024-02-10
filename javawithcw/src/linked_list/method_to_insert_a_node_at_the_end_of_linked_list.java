package linked_list;
 public class method_to_insert_a_node_at_the_end_of_linked_list {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Linked_List {
        Node head = null;
        Node tail = null;
        void implementAtEnd(int val) { //time complexity is O(1)
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void implementAtbeginning(int val){  //time complexity is O(1)
            Node temp=new Node(val);
            if(head==null){
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
        void insertAtindex(int idx,int val){ //time complexity is O(n)
            Node t=new Node(val);
            Node temp=head;
            if(idx==size()){
                implementAtEnd(t.data);
            }
            else if(idx==0){
                implementAtbeginning(t.data);
            }
            else if(idx<0 || idx>size()){    //if user press -1 at index so this message will print
                System.out.println("Please enter the valid input");
            }
            else {
                for (int i = 1; i <= idx - 1; i++) {
                    temp = temp.next;
                }
                t.next = temp.next;
                temp.next = t;
            }
        }
        int getAt(int idx){   //time complexity is O(n)
            Node temp=head;   //to get the value stored at the valid index
            if(idx<0 ||idx>=size()){
                System.out.println("Enter a valid value");
            }
            else{
                for (int i = 1; i <=idx; i++) {
                    temp=temp.next;
                }
            }
            return(temp.data);
        }
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("");
        }
        int size(){ // time complexity is O(n)
            Node temp1 =head;
            int count=0;
            while(temp1!=null){
                count++;
                temp1=temp1.next;
            }
            return count;
        }
    }
        public static void main(String[] args) {
            Linked_List ll=new Linked_List();
            ll.implementAtEnd(4); //add 4 at head because list is empty
            ll.implementAtEnd(5); //add 5 at tail
            //ll.display();    // display 4 5
            ll.implementAtbeginning(1); //add 1 to head
            ll.implementAtEnd(16);  //add 16 to tail
            //ll.display();   // display 1 4 5 16
            ll.implementAtbeginning(18); //add 18 to head
            ll.implementAtEnd(17); //add 17 to tail
            //ll.display();  // display 18 1 4 5 16 17
            //System.out.print(ll.size()); //it prints the size 6
            ll.insertAtindex(2,9); //it inserts 9 at index 2 mean 9 shift 4
            //ll.display(); // 18 1 9 4 5 16 17
            ll.insertAtindex(7,19);
            //ll.display();
            ll.insertAtindex(0,100);  //it inserts 100 at head
            ll.display(); //100 18 1 9 4 5 16 17 19
            System.out.println(ll.head.data); //it prints the value that store in head
            System.out.println(ll.tail.data); // it prints the value that stored in tail
            System.out.println(ll.getAt(1)); //it print data value stored at index 1
    }
 }
