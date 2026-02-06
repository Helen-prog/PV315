package lesson_6;

public class Sample4 {
    public static void main(String[] args) {
        Dog d = new Dog("Шарик");
        d.run();
    }
}


class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    void run() {
        class Foot {
            void run() {
                String name = "Foot";
                System.out.println("Собака " + Dog.this.name + " бежит...");
            }
        }

        Foot foot = new Foot();
        System.out.println("Экземпляр класса foot");
        foot.run();
    }


}

//class Dog{
//    private String name;
//    private Foot foot;
//
//    public Dog(String name) {
//        this.name = name;
//        foot = new Foot();
//    }
//
//    void run() {
//        foot.run();
//    }
//
//    class Foot{
//        void run(){
//            String name = "Foot";
//            System.out.println("Собака " + Dog.this.name + " бежит...");
//        }
//    }
//}