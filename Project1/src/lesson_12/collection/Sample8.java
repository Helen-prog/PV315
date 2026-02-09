package lesson_12.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Sample8 {
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<>();
        num.add(43);
        num.add(31);
        num.add(24);
        num.add(54);
        num.add(21);
        System.out.println(num);

        Integer max = null;
        for (Integer item : num) {
            if (max == null) {
                max = item;
            } else if (item > max) {
                max = item;
            }
        }
        System.out.println(max);
        System.out.println(Collections.min(num));
   
    }
}
