package queues;


public class CircularQueueImplementationUsingLinkedList {
    public static class QueueNode{
        QueueNode next;
        int data;
        public QueueNode(int data) {
            this.data = data;
        }
    }
    public static class CqByLinkedList{
        private QueueNode front;
        private QueueNode rear;
        private int size;
        public void enqueue(int data) {
            QueueNode newNode = new QueueNode(data);
            if(size==0) {
                front = rear = newNode;
                rear.next = front;
            }
            else {
                rear.next = newNode;
                rear = rear.next;
                rear.next = front;
            }
            size++;
        }
        public int dequeue() throws Exception{
            if(size==0) {
                throw new Exception("Queue is empty");
            }
            QueueNode temp = front;
            front = front.next;
            rear.next = front;
            size--;
            return temp.data;
        }
        public int peek() throws Exception{
            if(size==0) {
                throw new Exception("Queue is empty");
            }
            return front.data;
        }
        public boolean isEmpty(){
            return size==0;
        }
        public int size(){
            return size;
        }
        public void display(){
            QueueNode temp = front;
            while(temp.next!=front) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.print(temp.data+" ");
            System.out.println(" ");
        }


    }
    public static void main(String[] args) throws Exception {
        CqByLinkedList q = new CqByLinkedList();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.display();
        q.dequeue();
        q.dequeue();
        q.display();
    }
}
