package lesson_6;

public class Sample3 {
    public static void main(String[] args) {
        Outer out = new Outer("внешний");
        System.out.println(out.name);
        System.out.println(Outer.Inner.age);
        System.out.println(out.inner.innerName);
        Outer.Inner.info();
        out.inner.func();
    }
}

class Outer{
    String name;
    Inner inner;

    public Outer(String name) {
        this.name = name;
        inner = new Inner("внутренний");
    }

    class Inner{
        static int age;
        String innerName;

        static {
            age = 18;
        }

        public Inner(String innerName) {
            this.innerName = innerName;
        }

        public static void info() {
            System.out.println("Статический метод");
        }

        public void func(){
            System.out.println("Метод во вложенном классе");
        }
    }
}
