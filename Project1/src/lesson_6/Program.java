package lesson_6;

public class Program {
    public static void main(String[] args) {
        Person person = new Person();
        person.displayInfo();

        Person person1 = new Person("Игорь");
        person1.displayInfo();

        Person person2 = new Person(25);
        person2.displayInfo();

        Person person3 = new Person("Виктор", 2023);
        person3.displayInfo();
        person3.setAge(1235);

        System.out.println(person3.getName());
        System.out.println(person3.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age > 0 && age <= 120)
            this.age = age;
    }

    {
        name = "неизвестно";
        age = 18;
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    void displayInfo() {
        System.out.printf("Name: %s\nAge: %d\n", name, age);
    }
}


