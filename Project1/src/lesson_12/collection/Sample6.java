package lesson_12.collection;

import java.util.HashSet;
import java.util.Set;

public class Sample6 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Валентин");
        set.add("Николай");
        set.add("Григорий");
        set.add("Александр");
        set.add("Александр");
        System.out.println(set);
        set.remove("Александр");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println(set.size());
        System.out.println(set.contains("Александр"));
        System.out.println(set.contains("Григорий"));
        set.add(null);
        System.out.println(set);
    }
}
