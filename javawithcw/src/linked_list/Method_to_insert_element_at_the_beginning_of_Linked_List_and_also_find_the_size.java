package linked_list;

public class Method_to_insert_element_at_the_beginning_of_Linked_List_and_also_find_the_size {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
        public static class insert_at_head{
            Node head=null;
            Node tail=null;
            void implementingAtBeginning(int val){
                Node temp=new Node(val);
                if(head==null){
                    head=tail=temp;    //List is empty
                }
                else{
                    temp.next=head;  //List is non Empty
                }
                head=temp;
            }
            void display(){
                Node temp=head;
                while(temp!=null){
                    System.out.print(temp.data+" ");
                    temp=temp.next;
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
        }

    public static void main(String[] args) {
        insert_at_head ih=new insert_at_head();
        ih.implementingAtBeginning(4);
        ih.implementingAtBeginning(5);
        ih.implementingAtBeginning(6);
        ih.implementingAtBeginning(2);
        ih.implementingAtBeginning(3);
        ih.implementingAtBeginning(16);
        ih.display();
        System.out.println("");
        System.out.print("The size of Linked List is");
        System.out.println(ih.size()+" ");
    }
}
