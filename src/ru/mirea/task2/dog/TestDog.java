package ru.mirea.task2.dog;

public class TestDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Baron", 5);
        Dog.ToString(dog1);
        dog1.setName("Барон");
        Dog.ToString(dog1);
        dog1.inHumanAge();
    }
}
