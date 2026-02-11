package lesson_12.collection;

import java.util.Set;
import java.util.TreeSet;

public class Sample9 {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(8);
        treeSet.add(3);
        treeSet.add(7);
        System.out.println(treeSet);
        treeSet.remove(3);
        System.out.println(treeSet);
        System.out.println(treeSet.contains(5));
        System.out.println(treeSet.contains(2));
    }
}
