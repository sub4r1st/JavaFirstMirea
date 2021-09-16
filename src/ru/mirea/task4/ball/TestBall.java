package ru.mirea.task4.ball;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(40,30);
        ball.move(80, 10);
        System.out.println(ball.toString());
    }
}
