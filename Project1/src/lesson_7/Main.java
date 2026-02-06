package lesson_7;

public class Main {
    public static void main(String[] args) {
        Line l1 = new Line(5, "red", 0, 0, 10, 10);
//        l1.color = "red";
//        l1.width = 5;
//        l1.x1 = l1.y1 = 0;
//        l1.x2 = l1.y2 = 10;
//        l1.showProp();
        l1.show();
//        l1.showId();
//        l1.id = -5;
//        System.out.println(l1.id);
    }
}

class Properties{
    int width;
    String color;
    protected int id = 1;

    public Properties() {
        System.out.println("Конструктор Properties");
    }

    public Properties(int width, String color) {
        this.width = width;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    void show(){
        System.out.println("Ширина - " + width + "px, Цвет - " + color);
    }
}

class Line extends Properties{
    double x1, y1, x2, y2;
//    int id = 2;

    public Line(int width, String color) {
        super(width, color);
        System.out.println("Конструктор Line");
    }

    public Line(int width, String color, double x1, double y1, double x2, double y2) {
        super(width, color);
        this.y1 = y1;
        this.x1 = x1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    void show(){
        super.show();
        System.out.println("Координаты линии - x1 " + x1 + " y1 " + y1 + " x2 " + x2 + " y2 " + y2);
    }

    void showId(){
        System.out.println("id = " + id + ", super.id = " + super.id);
    }
}

class Triangle extends Properties{
    double x1, y1, x2, y2, x3, y3;
}
