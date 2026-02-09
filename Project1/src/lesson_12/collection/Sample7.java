package lesson_12.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sample7 {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        a.addAll(Arrays.asList(1,2,3,4,5,6,7));
        b.addAll(Arrays.asList(5,6,7,8,9));

        HashSet<Integer> c = new HashSet<>(a);
        System.out.println(c);
        c.addAll(b);
        System.out.println(c);

        HashSet<Integer> d = new HashSet<>(a);
        System.out.println(d);
        d.retainAll(b);
        System.out.println(d);

        HashSet<Integer> e = new HashSet<>(a);
        System.out.println(e);
        e.removeAll(b);
        System.out.println(e);
    }
}
