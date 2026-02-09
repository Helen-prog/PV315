package lesson_12.collection;

import java.util.Vector;

public class Sample4 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        vec.add("Сергей");
        vec.add("Михаил");
        vec.add("Николай");
        vec.add("Виктор");
        System.out.println(vec);
        System.out.println(vec.firstElement());
        System.out.println(vec.lastElement());
        vec.remove(2);
        System.out.println(vec);
        System.out.println(vec.get(1));
    }
}
