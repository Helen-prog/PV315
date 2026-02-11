package lesson_12.collection;

import java.util.ArrayDeque;

public class Sample14 {
    public static void main(String[] args) {
        ArrayDeque<String> states = new ArrayDeque<>();
        states.add("red");
        states.addFirst("blue");
        states.push("green");
        states.addLast("yellow");
        states.add("orange");

        System.out.println(states);
        System.out.println(states.getFirst());
        System.out.println(states.getLast());
        System.out.println(states.size());

        while (states.peek() != null) {
            System.out.println(states.pop());
        }
    }
}
