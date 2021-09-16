package ru.mirea.task3.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle b1 = new Circle(10, 10);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
    }
}
