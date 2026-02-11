package lesson_12.collection;

import java.util.PriorityQueue;

public class Sample12 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(1);
        pq.add(9);
        pq.add(2);
        pq.add(3);
        pq.add(3);
        System.out.println(pq);

        while (!pq.isEmpty()) {
            System.out.println(pq.remove());  // poll()
        }
        System.out.println(pq);
        System.out.println(pq.poll());
    }
}
