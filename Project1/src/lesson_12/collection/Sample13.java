package lesson_12.collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Sample13 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>(Comparator.comparingInt(String::length));
        pq.add("Александр");
        pq.add("Игорь");
        pq.add("Андрей");
        System.out.println(pq);
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());  // poll()
        }
    }
}
