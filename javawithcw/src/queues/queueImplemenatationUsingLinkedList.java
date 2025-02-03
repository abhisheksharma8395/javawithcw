package queues;

public class queueImplemenatationUsingLinkedList {
    public static  class QueueNode{
        int data;
        QueueNode next;
        public QueueNode(int data) {
            this.data = data;
        }
    }
    public static class Queue{
        QueueNode front = null;
        QueueNode rear = null;
        int size = 0;
        public void enqueue(int data){
            QueueNode newNode = new QueueNode(data);
            if(front == null){
                front = newNode;
                rear = newNode;
            }
            else{
                rear.next = newNode;
                rear = rear.next;
            }
            size++;
        }
        public int dequeue(){
            if(front == null){
                return -1;
            }
            int val = front.data;
            front = front.next;
            size--;
            return val;
        }
        public int peek(){
            if(front == null){
                return -1;
            }
            return front.data;
        }
        public boolean isEmpty(){
            return size == 0;
        }
        public int size(){
            return size;
        }
        public void display(){
            QueueNode temp = front;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(67);
        q.enqueue(27);
        q.enqueue(44);
        q.enqueue(49);
        q.enqueue(75);
        System.out.println(q.size()); //5
        q.display(); // 67,27,44,49,75
        q.dequeue();
        q.display(); // 27,44,49,75
        q.dequeue();
        q.display(); // 44,49,75
        System.out.println(q.peek()); // 44
        System.out.println(q.size()); //3
    }
}
