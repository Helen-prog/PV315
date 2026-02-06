package lesson_6.rect;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        setLength(length);
        setWidth(width);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public int getArea(){
        return length * width;
    }

    public int getPerimeter(){
        return 2 * (length + width);
    }

    public double getHypotenuse(){
        return Math.sqrt( Math.pow((double) length, 2) + Math.pow((double) width, 2));
    }

    public void getDraw(){
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
