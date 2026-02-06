package lesson_4;

import java.util.Arrays;

public class Str {
    public static void main(String[] args) {
//        String str1 = "Hello";
//        String str2 = "World";
//        String str3 = str1 + " " + str2;
//        System.out.println(str3);
//        char[] ch = {'h', 'e', 'l', 'l', 'o'};
//        String str = new String(ch);
//        int a = 5;
//        System.out.println(str + a);

//        int a = 5;
//        String b = "" + a;
//        System.out.println(b);

//        String str = "2";
//        int a = Integer.parseInt(str);
//        System.out.println(a);

//        String str = "";
//        int count = str.length();
//        System.out.println(count);

//        String name = "Nikita";
//        String name2 = name.toLowerCase();
//        String name3 = name.toUpperCase();
//
//        char c = name.charAt(5);
//        System.out.println(c);

//        String s = "";
//        if(s.isBlank()){  // s.length() == 0  || s.isEmpty()
//            System.out.println("Пустая строка");
//        }

//        String str = "Hello";
//        char[] res = str.toCharArray();
//
//        for (int i = 0; i < res.length; i++) {
//            System.out.println("Элемент [" + i + "]: " + res[i]);
//        }

//        String path = "https://www.oracle.com/java/technologies/downloads";
//
//        char[] chars = path.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == '/') {
//                chars[i] = '\\';
//            }
//        }
//
//        String s = new String(chars);
//        System.out.println(s);

//        String str = "I learning Java";
//        System.out.println(str);
//        System.out.println(str.indexOf("a"));
//        System.out.println(str.indexOf("a", 5));
//        System.out.println(str.lastIndexOf("a"));
//        System.out.println(str.lastIndexOf("a", 5));

//        System.out.println("     Hello World       ".trim());

//        System.out.println("I learning Java".substring(2));
//        System.out.println("I learning Java".substring(2, 12));

//        String str = "один два";
//        String one = str.substring(0, str.indexOf(" ")) ;
//        String two = str.substring(str.indexOf(" ")+1);
//        System.out.println(one + " " + two);

//        String str = "один два";
//        String[] words = str.split(" ");
//        System.out.println(words[1] + " " + words[0]);
//        System.out.println(Arrays.toString(words));

//        String str = "Никонов Валерий Анатольевич";
//        String[] fio = str.split(" ");
//        System.out.println(Arrays.toString(fio));
//        System.out.println(fio[0] + " " + fio[1].charAt(0) + ". " + fio[2].charAt(0) + ". ");

//        System.out.println(reverseString("Строка"));

//        String res = String.join(":", "00", "23", "30");
//        System.out.println(res);
//
//        String[] text = new String[]{"Hello", "World"};
//        String str = String.join(" ", text);
//        System.out.println(str);

//        String text = "Я изучаю Java. Мне нравится Java.";
//        System.out.println(text);
//        String[] words = text.split("Java");
//        System.out.println(Arrays.toString(words));
//        String res = String.join("Android", words);
//        System.out.println(res);

//        String text = "Я изучаю Java. Мне нравится Java.";
//        text = text.replace("Java", "Android");
//        System.out.println(text);


        String s1 = "Hello";
        String s2 = "hello";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(72 == 87);

    }

//    private static String reverseString(String str) {
//        String result = "";  // "р" + "тС"
//        for (int i = 0; i < str.length(); i++) {
//            result = str.charAt(i) + result;
//        }
//        return result;
//    }
}
