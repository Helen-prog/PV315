package lessson_9.generics;

public class Sample {
    public static void main(String[] args) {
        Point<Integer, String> pt = new Point<>(10, 20, "point_1");
//        pt.x = 10;
//        pt.y = 20;
        System.out.println(pt.getId() + " " + pt.getX() + " " + pt.getY());

        Point<Double, Integer> pt2 = new Point<>(10.7, 20.5, 1);
//        pt2.x = 10.7;
//        pt2.y = 20.5;
        System.out.println(pt2.getId() + " " + pt2.getX() + " " + pt2.getY());
    }
}

class Point<T, V>{
    private V id;
    private T x, y;

    public Point(T x, T y, V id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public V getId() {
        return id;
    }
}
