package lesson_7.animal;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void info() {
        System.out.printf("Я кот. Меня зовут %s. Мой возраст %d.%n", getName(), getAge());
    }

    @Override
    public void makeSound() {
        System.out.printf("%s мяукает.%n", getName());
    }
}
