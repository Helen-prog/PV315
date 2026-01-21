public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.println("Привет");
//        System.out.println();
//        System.out.print("Hello");
//        System.out.print("World");
//        System.out.print("");
//        int _a = 5, $b = 15;
//        _a = 10;
//        System.out.println(_a);
//        System.out.println($b);
//        var c = 10;
//        System.out.println(c);
//        final int WEEK;
//        WEEK = 7;
//        System.out.println(WEEK);
//        System.out.println(true);
//        System.out.println(false);
//        System.out.println(Boolean.TYPE);
//        System.out.println(Boolean.TRUE);
//        System.out.println(Boolean.FALSE);

//        char ch = '*';
//        System.out.println(ch);
//        char symbol = 1080;
//        System.out.println(symbol);
//        System.out.println(Character.SIZE);
//        System.out.println(Character.BYTES);

//        byte a = 127;
//        System.out.println(a);
//        System.out.println(Byte.SIZE);
//        System.out.println(Byte.BYTES);
//        System.out.println(Byte.MIN_VALUE);
//        System.out.println(Byte.MAX_VALUE);

//        float a = 8.5F;
//        System.out.println(a);
//        double b = 8.5;
//        System.out.println(b);

//        int a = 512;
//        System.out.println(a);
//
//        System.out.println(((Object) 512).getClass().getSimpleName());
//
//        long b = 12345678901L;
//        System.out.println(b);

//        int num16 = 0x12;
//        int num8 = 022;
//        int num2 = 0b10010;
//
//        System.out.println(num16);
//        System.out.println(num8);
//        System.out.println(num2);

//        int x = 123_456;
//        int y = 234_567__789;
//        double z = 234_567.149__159;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);

//        double d1 = 0.512;
//        double d2 = .512;
//        double d3 = 512.;
//        float f1 = 0.5f;
//        System.out.println(d1);
//        System.out.println(d2);
//        System.out.println(d3);
//        String text = "\tHello \nWor  ld";
//        System.out.println(text);
//        String text2 = """
//                Hello
//                Wor     ld
//                """;
//        System.out.println(text2);

//        System.out.print("5 + 3 = ");
//        System.out.println(5 + 3);
//
//        System.out.printf("5 + 3 = %d%n", 5 + 3);
//
//        int a = 5;
//        int b = 3;
//        System.out.printf("a = %d, b = %d", a, b);

//        String name = "Ирина";
//        int age = 18;
//        float height = 1.7f;
//        System.out.printf("Меня зовут %s. Мне %d лет. Мой рост %.2f %n", name, age, height);

//        System.out.printf("%8d %n", 123);
//        System.out.printf("%4d%5d %n", 123, 456);
//        System.out.printf("%4d %n", 123456789);
//        System.out.printf("%7.2f %n", 123.45);
//        System.out.printf("%-6s%5d %n", "num=", 456);

//        System.out.printf("--------------------------------\n");
//        System.out.printf("| %-10s | %-8s | %4s |%n", "CATEGORY", "NAME", "BITS");
//        System.out.printf("--------------------------------\n");
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Floating", "float", 32);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integer", "int", 32);
//        System.out.printf("--------------------------------\n");

//        System.out.println(5 / 2);
//        System.out.println(5. / 2);
//        System.out.println(5 / 2.);

//        int a = 1;
//        int b = 1;
//        int c = a++ + 3;  // c = 1 + 3
//        int d = ++b + 3;  // d = 2 + 3
//
//        System.out.println(a);  // 2
//        System.out.println(b);  // 2
//        System.out.println(c);  // 4
//        System.out.println(d);  // 5

//        int a = 2;
//        int b = a++;  // b = 2
//        int c = b + 3 + a;  // c = 2 + 3 + 3
//        System.out.println(c);  // 8

//        int a = 2;
//        int b = ++a;  // b = 3
//        int c = b + 3 + a;  // c = 3 + 3 + 3
//        System.out.println(c);  // 9


        int a = 1;
        int b = 2;
        int c = a + 5 * b++;  // 1 + 5 * 2
//        int c = (a + 5) * ++b;  // (1 + 5) * 3
        System.out.println(c);
    }
}