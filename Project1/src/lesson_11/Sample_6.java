package lesson_11;

import java.util.function.Function;
import java.util.function.Predicate;

public class Sample_6 {
    public static void main(String[] args) {
//        Predicate<Integer> p1 = x -> x > 0;
//        System.out.println(p1.test(5));
//        System.out.println(p1.test(-7));

//        Predicate<String> isPalindrome = (str) -> {
//            String reversed = new StringBuilder(str).reverse().toString();
//            return str.equals(reversed);
//        };
//
//        String str1 = "палиндром";
//        System.out.println(isPalindrome.test(str1));

        Function<Integer, String> convert = x -> String.valueOf(x) + " долларов";
        System.out.println(convert.apply(10));
    }
}
