package ru.mirea.task5.dish;

public class Main {
    public static void main(String[] args) {
        FlatPlate flatPlate = new FlatPlate("Донской продукт", "Light-brown", 2020);
        flatPlate.eating();
        System.out.println(flatPlate.toString());

        Bowl bowl = new Bowl("Ikea", "White", 2012);
        bowl.eating();
        System.out.println(bowl.toString());
    }
}
