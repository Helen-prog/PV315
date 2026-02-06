package lesson_8.table;

import java.awt.*;

public abstract class Table {
    private int width;
    private int height;
    private double radius;

    public Table() {
    }

    public Table(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Table(int width) {
        this.width = this.height = width;
    }

    public Table(double radius) {
        this.radius = radius;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public abstract void calcArea();
}
