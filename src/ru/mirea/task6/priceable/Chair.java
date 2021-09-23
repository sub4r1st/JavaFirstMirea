package ru.mirea.task6.priceable;

public class Chair implements Priceable{
    private int price = 1799;
    @Override
    public int getPrise() {
        return price;
    }
}
