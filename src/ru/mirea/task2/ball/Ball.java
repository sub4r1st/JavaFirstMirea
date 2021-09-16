package ru.mirea.task2.ball;

public class Ball {
    private double radius;
    private String color;

    public Ball(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public static void printInf(Ball ball) {
        System.out.println("Information\nColor: " + ball.getColor() + "\nVolume: " + (4/3*Math.PI*Math.pow(ball.getRadius(),3)));
    }
}
