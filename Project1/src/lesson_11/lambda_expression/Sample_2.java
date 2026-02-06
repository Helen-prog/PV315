package lesson_11.lambda_expression;

interface Calc{
    int calculate();
}

public class Sample_2 {
//    static int x = 100;
//    static int y = 200;

    public static void main(String[] args) {
        int x = 100;
        int y = 200;
        Calc calc = () -> {
//            x = 30;
            return x + y;
        };
        System.out.println(x);
        System.out.println(calc.calculate());
    }
}
