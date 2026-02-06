package lesson_11.lambda_expression;

interface Calculate<T>{
    T calculate(T x, T y);
}

public class Sample_3 {
    public static void main(String[] args) {
        Calculate<Integer> cal = (x, y) -> x + y;
        Calculate<String> cal2 = (x, y) -> x + y;
        System.out.println(cal.calculate(20, 10));
        System.out.println(cal2.calculate("Hello", "World"));
    }
}
