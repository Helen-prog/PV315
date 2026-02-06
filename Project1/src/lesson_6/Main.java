package lesson_6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int min = 5;
        int max = 10;
        int cnt = 30;
        for (int i = 0; i < cnt; i++) {
//            System.out.println(rand.nextBoolean());
//            System.out.println(rand.nextDouble());
//            System.out.println(rand.nextInt(max));
//            System.out.println(rand.nextInt(max - min) + min);
            System.out.println(rand.nextInt(max - min + 1) + min);
        }
    }
}
