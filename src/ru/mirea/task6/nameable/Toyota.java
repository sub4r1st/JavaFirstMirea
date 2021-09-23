package ru.mirea.task6.nameable;

public class Toyota implements Nameable{
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
