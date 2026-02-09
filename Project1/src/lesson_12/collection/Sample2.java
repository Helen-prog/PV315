package lesson_12.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Sample2 {
    public static void main(String[] args) {
        Student st1 = new Student("Viktor", 2);
        Student st2 = new Student("Anna", 3);
        Student st3 = new Student("Igor", 1);
        Student st4 = new Student("Irina", 3);
        Student st5 = new Student("Roman", 2);
        LinkedList<Student> list = new LinkedList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        System.out.println(list);
        System.out.println(list.get(2));
        Student st6 = new Student("Maria", 2);
        Student st7 = new Student("Sergey", 1);
        list.add(st6);
        list.add(1, st7);
        System.out.println(list);
        Student st8 = new Student("Vlad", 3);
        list.set(1, st8);
        System.out.println(list);
        list.remove(3);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
//        for(Student st : list){
//            System.out.println(st);
//        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        Iterator p = list.listIterator(2);
//        Iterator p = list.descendingIterator();
//        while (p.hasNext()) {
//            System.out.println(p.next());
//        }

//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());

        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
    }
}

class Student{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
