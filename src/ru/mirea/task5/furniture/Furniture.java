package ru.mirea.task5.furniture;

public abstract class Furniture {
    private int length;
    private int width;
    private int height;
    private int price;
    private String name;
    private String color;

    public abstract void manufacturer();

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getLength(){
        return length;
    }

    public void setLength(int length){
        this.length = length;
    }

    public int getWidth(){
        return width;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
}
