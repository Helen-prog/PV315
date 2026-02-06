package lesson_7.animal;

public class Main {
    public static void main(String[] args) {
        final int N = 2;
        Animal[] animals = new Animal[N];
        animals[0] = new Cat("Пушок", 2);
        animals[1] = new Dog("Мухтар", 4);

        for (int i = 0; i < N; i++) {
            animals[i].info();
            animals[i].makeSound();
        }
    }
}
