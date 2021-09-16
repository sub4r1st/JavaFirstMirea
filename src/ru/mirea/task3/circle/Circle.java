package ru.mirea.task3.circle;

public class Circle {
    private double x = 0.0;
    private double y = 0.0;
    public Circle(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move( double xD, double yD){
        x+=xD;
        y+=yD;
    }
    public String toString() {
        return "Ball : ("+this.x+", "+this.y+").";
    }

}
