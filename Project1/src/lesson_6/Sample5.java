package lesson_6;

public class Sample5 {
    public static void main(String[] args) {
        Sample5 obj = new Sample5();
        obj.print();
    }

    private int outer_x = 100;

    void print(){
        Inner inner = new Inner();
        inner.innerMethod();
    }

    class Inner{
        public void innerMethod(){
            System.out.println(outer_x);
            System.out.println(Sample5.this.outer_x);
        }
    }
}
