package lesson_6;

public class Sample2 {
    public static void main(String[] args) {
        Calculate obj = new Calculate();
        obj.calculate(1, 2);
        obj.calculate(1, 2, 3);
        obj.calculate(2.5, 3.4);
        obj.calculate(2.5, 2);
        obj.calculate(2, 2.5);
    }
}

class Calculate{
    public void calculate(int a, int b){
        System.out.println("Сумма двух чисел: " + (a + b));
    }
    public void calculate(int a, int b, int c){
        System.out.println("Сумма трех чисел: " + (a + b + c));
    }
    public void calculate(double a, double b){
        System.out.println("Сумма двух вещественных чисел: " + (a + b));
    }
    public void calculate(double a, int b){
        System.out.println("В результате вещественное число: " + (a + b));
    }
    public void calculate(int a, double b){
        System.out.println("В результате целое число: " + (int)(a + b));
    }
}
