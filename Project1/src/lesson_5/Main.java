package lesson_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        String str = "ЁАЯаяё";
//        System.out.println(str.codePointAt(0));  // Ё
//        System.out.println(str.codePointAt(1));  // А
//        System.out.println(str.codePointAt(2));  // Я
//        System.out.println(str.codePointAt(3));  // a
//        System.out.println(str.codePointAt(4));  // я
//        System.out.println(str.codePointAt(5));  // ё

//        String str = "AZaz";
//        System.out.println(str.codePointAt(0));  // A
//        System.out.println(str.codePointAt(1));  // Z
//        System.out.println(str.codePointAt(2));  // a
//        System.out.println(str.codePointAt(3));  // z


//        String s = "Я ищу совпадения в 2026 году. И я их найду в 2 счёта. 54-38 Hello_World 20000000000";
//        String s = "one\ntwo";
//        String s = "Java,\njava,\nJAVA";
//        String s = "<body>Пример жадного соответствия</body>";
//        String s = "Word2016, PS6, AI5";
//        String s = "Ольга и Виталий отлично учатся";
//        String s = "Цифры: 7, ++++17, -42, 0013, 0.3";
//        String s = "author=Пушкин А.С.; title  = Евгений Онегин; price =200; year= 1831";
//        String s = "I learning Java 000";
//        String s = "Java_master";
//        String pattern = "[12][0-9][0-9][0-9]";
//        String pattern = "[А-яЁё]";  // [А-Яа-я]
//        String pattern = "[A-Za-z]";  //
//        String pattern = "[А-яЁёA-Za-z\\[\\]-]";  //
//        String pattern = "[^0-9]";  //
//        String pattern = "\\w+";  //
//        String pattern = "20*";  //
//        String pattern = "[+-]?\\d+\\.?\\d*";  //
//        String pattern = "[+-]?[\\d.]+";  //
//        String pattern = "\\w+\\s*=\\s*[0-9А-я\\s.]+";  //
//        String pattern = "\\w+\\s*=[^;]+";  //
//        String pattern = "^\\w+\\s\\w+";  //
//        String pattern = "^[\\w-]{3,16}$";  //
//        String pattern = "\\d+ # поиск цифр";
//        String pattern = "one.\\w+";
//        String pattern = "(?im)java";
//        String pattern = "<.*?>";
//        String pattern = "([a-z]+)(\\d*)";
//        String pattern = "Петр|Ольга|Виталий";
        // *?, +?, ??, {n,m}?, {n,}?
//        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
//        Pattern regex = Pattern.compile(pattern, Pattern.COMMENTS);
//        Pattern regex = Pattern.compile(pattern, Pattern.DOTALL);
//        Pattern regex = Pattern.compile(pattern, Pattern.MULTILINE);
//        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
//        Matcher matcher = regex.matcher(s);
//        System.out.println(matcher.find());
//        while (matcher.find()) {
//            System.out.println("Шаблон совпадения найден с " + matcher.start() + " по " + (matcher.end() - 1));
//            System.out.println(s.substring(matcher.start(), matcher.end()));
//            System.out.println(matcher.group());
//            System.out.println(matcher.group(1));
//            System.out.println(matcher.group(2));
//        }

//        Pattern p = Pattern.compile("[.2]");
//        String[] arr = p.split("Я ищу совпадения в 2026 году. И я их найду в 2 счёта.");
//        for(String temp : arr) {
//            System.out.println(temp);
//        }

        String s = "05-03-1987 // Дата рождения";
        String s2 = s.replaceAll("\\/\\/.*", "").replaceAll("-", ".");
        System.out.println("Дата рождения: " + s2);
    }
}
