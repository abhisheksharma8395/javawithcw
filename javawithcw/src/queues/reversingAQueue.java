package queues;

import java.util.LinkedList;
import java.util.Queue;

public class reversingAQueue {
    public static void queueReverse(Queue<Integer> queue) {
        if(queue.isEmpty()){
            return;
        }
        int temp = queue.poll();
        queueReverse(queue);
        queue.add(temp);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(63);
        queue.add(27);
        queue.add(88);
        queue.add(78);
        queue.add(60);
        System.out.println(queue);
        queueReverse(queue);
        System.out.println(queue);
    }
}
