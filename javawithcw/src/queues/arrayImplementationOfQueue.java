package queues;

public class arrayImplementationOfQueue {
    public static class Queue {
        int[] array = new int[100];
        int size = 0;
        int front = -1;
        int rear = -1;

        public void enqueue(int x) {
            if (rear == array.length - 1) {
                return;
            }
            if(front == -1) {
                front = 0;
            }
            size = size + 1;
            array[rear+1] = x;
            rear++;
        }

        public int dequeue() {
            if (isEmpty()) {
                return -1;
            }
            int temp = array[front];
            front++;
            size = size - 1;
            return temp;
        }

        public int peek() {
            if (front > rear) {
                return -1;
            }
            return array[front];
        }

        public int size() {
            return size;
        }
        public boolean isEmpty() {
            return size == 0;
        }
        public void display() {
            for (int i = front; i <= rear; i++) {
                System.out.print(array[i]+" ");
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
