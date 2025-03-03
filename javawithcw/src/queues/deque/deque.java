package queues.deque;

import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.add(5);        // last add
        dq.remove();  // first remove
        System.out.println(dq);
        dq.addFirst(3);
        dq.removeLastOccurrence(3);
        System.out.println(dq);
    }
}
