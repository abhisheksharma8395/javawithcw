package linked_list;

public class Printing_the_LinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
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
            System.out.println(a.data); //it prints the data of a
            System.out.println(a.next.data); //it prints the data of b
            System.out.println(a.next.next.data);  //it prints the data of c
            System.out.println(a.next.next.next.data); //it prints the data of d
            System.out.println(a.next.next.next.next.data); //it prints the data of e
        }
    }
