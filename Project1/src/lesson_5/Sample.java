package lesson_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Sample {
    public static void main(String[] args) {
        try {
//            String s = "23 23:45 текст";
//            String pattern = "[0-2][0-9]:[0-5][0-9";
            String s = "12 сентября 2025 года";
            String pattern = "\\d{2,}?";  // \d{2}
            Pattern regex = Pattern.compile(pattern);
            Matcher matcher = regex.matcher(s);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch (PatternSyntaxException e) {
            System.out.println("Неправильное регулярное выражение: " + e.getMessage());
            System.out.println("Описание: " + e.getDescription());
            System.out.println("Позиция: " + e.getIndex());
            System.out.println("Неправильный шаблон: " + e.getPattern());
        }
    }
}
