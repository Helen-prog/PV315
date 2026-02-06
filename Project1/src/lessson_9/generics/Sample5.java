package lessson_9.generics;

public class Sample5 {
    public static void main(String[] args) {
        GeomInterface<Float> pt = new Point2<Float>();
        pt.setCoords(10f, 20f);
        System.out.println(pt.getCoords(TypeCoords.COORDS_X));
        System.out.println(pt.getCoords(TypeCoords.COORDS_Y));
    }
}

enum TypeCoords{
    COORDS_X, COORDS_Y;
}

interface GeomInterface<T>{
    void setCoords(T x, T y);
    T getCoords(TypeCoords type);
}

class Point2<T> implements GeomInterface<T>{
    private T x, y;

    @Override
    public void setCoords(T x, T y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public T getCoords(TypeCoords type) {
        return type == TypeCoords.COORDS_X ? x : y;
    }
}
