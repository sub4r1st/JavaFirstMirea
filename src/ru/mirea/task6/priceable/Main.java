package ru.mirea.task6.priceable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Table table = new Table();
        Chair chair = new Chair();
        ArrayList<Priceable> products = new ArrayList<>();
        products.add(table);
        products.add(chair);
        for (Priceable product:
             products) {
            System.out.println("Цена товара " + product.getClass().getSimpleName() + ": " + product.getPrise());
        }
    }
}
