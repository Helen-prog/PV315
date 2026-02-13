package lesson_13;

import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Красный", "Кремовый", "Синий", "Зеленый", "Коричневый");
        System.out.println("Исходный список цветов: " + colors);
        char startingLetter = 'К';
        long ctr = colors.stream().filter(s -> s.startsWith(String.valueOf(startingLetter))).count();
        System.out.println(ctr);
    }
}
