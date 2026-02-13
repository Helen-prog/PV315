package lesson_13;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
//        Stream<String> citiesStream = Arrays.stream(new String[]{"Сочи", "Москва", "Калининград"});
////        citiesStream.forEach(System.out::println);
//        citiesStream.forEach(s -> System.out.println(s));
//
//        IntStream intStream = Arrays.stream(new int[]{1, 2, 3, 4, 5});
//        intStream.forEach(System.out::println);

//        String[] arguments = {"one", "first", "two", "second", "three", "third", "four", "fourth", "five", "fifth"};
//        Map<String, String> argsMap = new LinkedHashMap<>(arguments.length / 2);
//        for (int i = 0; i < arguments.length; i += 2) {
//            argsMap.put(arguments[i], arguments[i + 1]);
//        }
//        argsMap.forEach((key, value) -> System.out.println(key + "=" + value));

//        Stream<String> citiesStream = Stream.of("Сочи", "Москва", "Калининград");
//        citiesStream.filter(s -> s.length() >= 6).forEach(System.out::println);


        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Сочи", "Москва", "Калининград");
        cities.stream().filter(s -> s.length() >= 6).forEach(System.out::println);


//        int[] numbers = {-5, 0, 1, 2, 3, -4, 4, -3, -2, -1, 5};
//        int counter = 0;
//        for (int i : numbers) {
//            if (i > 0) {
//                counter++;
//            }
//        }
//        System.out.println(counter);
//
//        long count = IntStream.of(-5, 0, 1, 2, 3, -4, 4, -3, -2, -1, 5).filter(i -> i > 0).count();
//        System.out.println(count);
    }
}
