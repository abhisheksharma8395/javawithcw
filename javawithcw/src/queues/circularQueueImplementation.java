package queues;

public class circularQueueImplementation {
    public static class queue{
        private int size = 0;
        private int front;
        private int rear;
        private final int[] array = new int[5];
        private int n = 5;
        public void enqueue(int data) throws Exception{
            if(size==0){
                front=rear=0;
                array[rear]=data;
            } else if (size==n) {
                throw new Exception("Queue is full");
            }
            else if(rear<n-1){
                array[++rear]=data;
            }
            else if(rear==n-1){
                rear=0;
                array[rear]=data;
            }
            size++;
        }
        public int dequeue() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty");
            }
            else if(front==n-1){
                int popped = array[front];
                front = 0;
                size--;
                return popped;
            }
            int popped = array[front];
            front++;
            size--;
            return popped;
        }
        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty");
            }
            return array[front];
        }
        public int size(){
            return size;
        }
        public void display() {
            if(size>0){
                if(front<=rear){
                    for(int i=front;i<=rear;i++){
                        System.out.print(array[i]+" ");
                    }
                }
                else{
                    for (int i = front; i < n; i++) {
                        System.out.print(array[i]+" ");
                    }
                    for (int i = 0; i <= rear; i++) {
                        System.out.println(array[i]+" ");
                    }
                }
            }
            else{
                System.out.println("Queue is Empty");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) throws Exception {
        queue q = new queue();
        q.display();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.display();
        q.dequeue();
        q.display();
        q.enqueue(5);
        q.enqueue(6);
        q.display();
        q.enqueue(7);

    }
}
