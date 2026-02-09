package lesson_11.human;

public class Program {
    public static void main(String[] args) {
        HumanFactory<Human> humanFactory = Human::new;
        Human human = humanFactory.create("Olga", "Pavlova");
        System.out.println(human);
    }
}
