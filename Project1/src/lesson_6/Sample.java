package lesson_6;

import static java.lang.System.*;

public class Sample {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        out.println(Point.getCount());
        out.println(p2.getCount());
    }
}

class Point{
    private static int count = 10;
    int x,y;

//    static {
//        count = 10;
//    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
