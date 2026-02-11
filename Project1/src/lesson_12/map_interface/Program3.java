package lesson_12.map_interface;

import java.util.Comparator;
import java.util.TreeMap;

public class Program3 {
    public static void main(String[] args) {
//        TreeMap<String, String> tm = new TreeMap<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
        TreeMap<String, String> tm = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        tm.put("Python", "*.py");
        tm.put("C++", "*.cpp");
        tm.put("JavaScript", "*.js");
        tm.put("Golang", "*.go");
        tm.put("Java", "*.java1");
        tm.put("java", "*.java");
        System.out.println(tm);
        System.out.println(tm.get("Java"));
        tm.remove("Golang");
        System.out.println(tm);
//        System.out.println(tm.descendingMap());
//        System.out.println(tm.lastEntry());
//        System.out.println(tm.firstEntry());
    }
}
