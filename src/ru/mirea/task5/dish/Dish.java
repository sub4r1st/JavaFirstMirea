package ru.mirea.task5.dish;

public abstract class Dish {
    private String company;
    private String color;
    private int yearOfRelease;

    public abstract void eating();

    public String getCompany(){
        return company;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getYearOfRelease(){
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease){
        this.yearOfRelease = yearOfRelease;
    }
}



