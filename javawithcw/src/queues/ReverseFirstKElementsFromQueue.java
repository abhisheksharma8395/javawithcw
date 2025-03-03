package queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsFromQueue {
    public static void reverse(Queue<Integer> queue, int k) {
        Stack<Integer> stack = new Stack<Integer>();
        int size = queue.size();
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }
        for (int i = 0; i < k; i++) {
            queue.offer(stack.pop());
        }
        for (int i = 0; i < size-k; i++) {
            queue.offer(queue.poll());
        }

    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        int k = 3;
        reverse(queue, k);
        System.out.println(queue);
    }
}
