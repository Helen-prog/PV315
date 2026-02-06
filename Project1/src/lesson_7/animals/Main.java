package lesson_7.animals;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.voice();
//        cat.voice("Мурка");

        Cat cat1 = new Cat();
        cat1.voice();
        cat1.voice("Мурка");
    }
}
