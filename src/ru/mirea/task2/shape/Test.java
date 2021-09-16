package ru.mirea.task2.shape;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape("Semisphere", "yellow", 123.45 );
        Shape.ToString(shape);
        Shape shape2 = new Shape();
        Shape.ToString(shape2);
    }
}
