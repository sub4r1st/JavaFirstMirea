package ru.mirea.task5.dog;

public abstract class Dog {
    private int length;
    private String name;
    private String color;

    public abstract void historyOfAppearance();

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

}
