package lesson_10.dog;

public class DogNotReadyException extends Exception {
    public DogNotReadyException(String message) {
        super(message);
    }
}
