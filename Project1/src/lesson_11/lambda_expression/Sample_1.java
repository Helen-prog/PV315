package lesson_11.lambda_expression;


interface Printable{
    void print();
}

public class Sample_1 {
    public static void main(String[] args) {
        Printable p = () -> System.out.println("Hello");
        p.print();
    }
}
