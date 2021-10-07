package ru.mirea.task6.nameable;

public class Subaru implements Nameable{
    public void tostring(){
        System.out.println("Я ЛОХ");
    }
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
