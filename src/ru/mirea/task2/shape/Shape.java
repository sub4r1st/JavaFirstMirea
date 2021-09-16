package ru.mirea.task2.shape;

public class Shape {
    String shape;
    String color;
    double volume;

    public Shape(String shape, String color, double volume) {
        this.shape = shape;
        this.color = color;
        this.volume = volume;
    }

    public Shape(){
        shape = "Cube";
        color = "blue";
        volume = 25.6;
    }

    public static void ToString(Shape pshape){
        System.out.println("The shape is " + pshape.shape + "\nThe color of this shape is " + pshape.color + "\nThe volume is " + pshape.volume);
    }
}
