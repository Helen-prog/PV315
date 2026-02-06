package lesson_11.lambda_expression;

interface CalcInterface {
    int calculate(int a, int b);
}

public class Sample {
    public static void main(String[] args) {
        int a = 10, b = 20;
        CalcInterface calc = (x, y) -> x + y;
        CalcInterface sub = (x, y) -> x - y;
        CalcInterface mul = (x, y) -> x * y;
        System.out.println(calc.calculate(a, b));
        System.out.println(sub.calculate(a, b));
        System.out.println(mul.calculate(a, b));
    }
}
