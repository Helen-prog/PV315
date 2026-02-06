package lesson_10.dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Лексус");
        dog.putCollar();
//        dog.putMuzzle();
        dog.putLeash();

        try {
            dog.walk();
        } catch (DogNotReadyException e) {
            System.out.println(e.getMessage());
        }
    }
}