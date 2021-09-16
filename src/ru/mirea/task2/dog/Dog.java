package ru.mirea.task2.dog;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void inHumanAge(){
        System.out.println("Count of years in human age: " + age*7);
    }

    public static void ToString(Dog dog){
        System.out.println("Information about dog\nName is " + dog.name + "\nAge is " + dog.age);
    }
}
