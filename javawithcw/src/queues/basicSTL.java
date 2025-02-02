package queues;

import java.util.LinkedList;
import java.util.Queue;

public class basicSTL {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(11);
        q.add(12);

        q.add(43);
        q.add(64);
        q.add(52);
        System.out.println(q); // 11,12,43,64,52
        q.remove();
        System.out.println(q); //12,43,64,52
        q.poll();
        System.out.println(q); //43,64,52
        System.out.println(q.element()); // 43
        System.out.println(q.peek()); //43
        System.out.println(q.size()); //3

    }
}
