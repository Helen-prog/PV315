package lesson_8;

public class Base {
    public static void main(String[] args) {
//        final int N = 3;
//        Shape[] shapes = new Shape[N];
//        shapes[0] = new Line(5, "red", 1,2,3,4);
//        shapes[1] = new Rectangle(2, "yellow", 5, 10);
//        shapes[2] = new Triangle(3, "green", 4, 9);
//
//        ShapeInterface sh[] = new ShapeInterface[N];
//        sh[0] = new Line(5, "red", 1,2,3,4);
//        sh[1] = new Rectangle(2, "yellow", 5, 10);
//        sh[2] = new Triangle(3, "green", 4, 9);

//        for(Shape shape : shapes) {
//            shape.draw();
//            shape.getSquare();
//        }

//        for (int i = 0; i < shapes.length; i++) {
//            shapes[i].draw();
//            if(shapes[i] instanceof MathShape){
//                System.out.println("Площадь: " + ((MathShape) shapes[i]).getSquare());
//            }
//            sh[i].info();
//        }

        Line l =  new Line(5, "red", 1,2,3,4);
        l.setCoords(50, 60, 70, 80);
        l.info();
//        GeomInterface.showInterval();
    }
}

class InterfaceGroup{
    private interface Interface1{
        void method_1();

        private void privateMethod(){
            System.out.println("privateMethod");
        }
    }

    interface Interface2 extends Interface1{
        void method_2();
    }
}

class ReleaseInterface implements InterfaceGroup.Interface2 {


    @Override
    public void method_2() {

    }

    @Override
    public void method_1() {

    }
}

interface MathGeom{
    default double getSquare(){
        return 0;
    };
}

abstract class Geom{
    int width;
    String color;
    abstract void draw1();
}

interface GeomInterface{
    int MIN_COORDS = 0;  // public static final
    int MAX_COORDS = 1000;

    static void showInterval(){
        System.out.println("[" + MIN_COORDS + ", " + MAX_COORDS + "]");
    }
}

interface ShapeInterface{
    void info();  // public abstract
}

interface MathShape{
    double getSquare();
}

abstract class Shape{
    private int width;
    private String color;

    public Shape(int width, String color) {
        this.width = width;
        this.color = color;
    }

    abstract void draw();
}

class Line extends Shape implements ShapeInterface, GeomInterface{
    private int x1, y1, x2, y2;

    public Line(int width, String color, int x1, int y1, int x2, int y2) {
        super(width, color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    void draw() {
        System.out.println("Рисование линии");
    }

    private boolean isCheck(int n){
        return MIN_COORDS <= n && n <= MAX_COORDS;
    }

    void setCoords(int x1, int y1, int x2, int y2){
        if(isCheck(x1) && isCheck(x2) && isCheck(y1) && isCheck(y2)){
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

    @Override
    public void info() {
        System.out.println("Координаты линии: " + x1 + "," + y1 + "," + x2 + "," + y2);
        GeomInterface.showInterval();
    }

//    @Override
//    public double getSquare() {
//        return 0;
//    }

//    @Override
//    void draw1() {
//
//    }
}

class Rectangle extends Shape implements MathShape, ShapeInterface{
    private int width, height;

    public Rectangle(int width, String color, int width1, int height) {
        super(width, color);
        this.width = width1;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Рисование прямоугольника");
    }

    public double getSquare() {
        return width * height;
    }

    @Override
    public void info() {
        System.out.println("Ширина: " + width + ", Высота: " + height);
    }
}

class Triangle extends Shape implements MathShape, ShapeInterface{
    private int length, height;

    public Triangle(int width, String color, int length, int height) {
        super(width, color);
        this.length = length;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Рисование треугольника");
    }

    public double getSquare() {
        return 0.5 * length * height;
    }

    @Override
    public void info() {
        System.out.println("Длина: " + length + ", Высота: " + height);
    }
}
