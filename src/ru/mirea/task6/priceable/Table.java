package ru.mirea.task6.priceable;

public class Table implements Priceable{
    int price = 1099;
    @Override
    public int getPrise() {
        return price;
    }
}
