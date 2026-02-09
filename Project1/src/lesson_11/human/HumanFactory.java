package lesson_11.human;

@FunctionalInterface
public interface HumanFactory <P extends Human>{
    P create(String firstName, String lastName);
//    P concatenate(P first, P last);
}
