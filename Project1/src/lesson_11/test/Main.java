package lesson_11.test;

public class Main {
    public static void main(String[] args) {
        int x = 5, y = 3;
        Calc sum = new Calc();
        sum.calculate(x, y);


        CalcInterface mul = (a, b) -> System.out.println(a * b);
        mul.calculate(x, y);

//        CalcInterface mul = new CalcInterface() {
//            @Override
//            public void calculate(int a, int b) {
//                System.out.println(a * b);
//            }
//        };
//        mul.calculate(x, y);

//        Calc mul = new Calc(){
//            @Override
//            public void calculate(int a, int b) {
//                System.out.println(a * b);
//            }
//        };
//        mul.calculate(x, y);
    }
}

interface CalcInterface{
    void calculate(int a, int b);
}

class Calc implements CalcInterface{
    @Override
    public void calculate(int a, int b) {
        System.out.println(a + b);
    }
}

//class CalcElse extends Calc {
//    @Override
//    public void calculate(int a, int b) {
//        System.out.println(a * b);
//    }
//}
