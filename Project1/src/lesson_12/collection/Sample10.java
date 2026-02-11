package lesson_12.collection;

import java.util.TreeSet;

public class Sample10 {
    public static void main(String[] args) {
        TreeSet<Student2> ts = new TreeSet<>();
        Student2 st1 = new Student2("Виктор", 5);
        Student2 st2 = new Student2("Герман", 3);
        Student2 st3 = new Student2("Ольга", 1);
        Student2 st4 = new Student2("Ирина", 4);
        Student2 st5 = new Student2("Михаил", 2);
        ts.add(st1);
        ts.add(st2);
        ts.add(st3);
        ts.add(st4);
        ts.add(st5);
        System.out.println(ts);
        System.out.println(ts.first());
        System.out.println(ts.last());
        Student2 st6 = new Student2("Алена", 3);
        System.out.println(ts.headSet(st6));
        System.out.println(ts.tailSet(st6));
        Student2 st7 = new Student2("Игорь", 2);
        Student2 st8 = new Student2("Владимир", 4);
        System.out.println(ts.subSet(st7, st8));
    }
}

class Student2 implements Comparable<Student2> {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student2 o) {
        return course-o.course;
    }
}