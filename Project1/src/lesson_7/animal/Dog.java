package lesson_7.animal;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void info() {
        System.out.printf("Я собака. Меня зовут %s. Мой возраст %d.%n", getName(), getAge());
    }

    @Override
    public void makeSound() {
        System.out.printf("%s гавкает.%n", getName());
    }
}
