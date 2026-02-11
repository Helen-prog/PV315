package lesson_12.collection;

import java.util.LinkedHashSet;

public class Sample11 {
    public static void main(String[] args) {
        LinkedHashSet <Integer> lhs = new LinkedHashSet <>();
        lhs.add(7);
        lhs.add(3);
        lhs.add(1);
        lhs.add(4);
        lhs.add(9);
        System.out.println(lhs);
        lhs.remove(4);
        System.out.println(lhs);
        System.out.println(lhs.contains(4));
        System.out.println(lhs.contains(3));
        System.out.println(lhs.removeIf(x -> x > 5));
        System.out.println(lhs);
    }
}
