package lesson_12.equals;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Александр", 25);
        Person p2 = new Person("Светлана", 25);
        int res = p1.compareTo(p2);
        switch (res) {
            case -1:
                System.out.println(p2.getName() + " старше");
                break;
            case 1:
                System.out.println(p1.getName() + " старше");
                break;
            default:
                System.out.println("Эти люди одного возраста");
        }
    }
}

class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        if (this.age == o.age) {
            return 0;
        } else {
            return this.age < o.age ? -1 : 1;
        }
    }
}
