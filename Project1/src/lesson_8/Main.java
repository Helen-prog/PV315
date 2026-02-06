package lesson_8;

public class Main {
    public static void main(String[] args) {
        Dog an = new Dog("Герда");
        an.makeSound();
        an.sleep();
    }
}

abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();

    public void sleep(){
        System.out.println(name + " спит!");
    }
}

class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " гавкает");
    }
}
