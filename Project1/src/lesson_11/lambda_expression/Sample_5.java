package lesson_11.lambda_expression;

interface Converter<F, T>{
    T convert(F from);
}

public class Sample_5 {
    public static void main(String[] args) {
//        Converter<String, Integer> converter = from -> Integer.parseInt(from);
        Converter<String, Integer> converter = Integer::parseInt;
        Integer converted = converter.convert("123");
        System.out.println(converted);
    }
}
