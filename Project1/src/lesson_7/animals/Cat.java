package lesson_7.animals;

public class Cat extends Animal {

    @Override
    public void voice() {
        System.out.println("Мяу!");
    }

    public void voice(String name) {
        System.out.println(name + " говорит Мяу!");
    }
}
