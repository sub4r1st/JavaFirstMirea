package ru.mirea.task7.task3;

public class TestMain3 {
    public static void main(String[] args) {
        MovableRectangle first = new MovableRectangle(0,1,2,4,1,1);
        System.out.println(first.toString());
        first.moveLeft();
        System.out.println(first.toString());
        first.moveDown();
        System.out.println(first.toString());
        first.moveRight();
        System.out.println(first.toString());
    }
}
