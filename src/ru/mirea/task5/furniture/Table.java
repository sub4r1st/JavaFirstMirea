package ru.mirea.task5.furniture;

public class Table extends Furniture{
    public Table(String name, String color, int price, int length, int width, int height) {
        super.setName(name);
        super.setColor(color);
        super.setPrice(price);
        super.setLength(length);
        super.setWidth(width);
        super.setHeight(height);
    }

    public String toString() {
        return "Информация о " + this.getClass().getSimpleName() + "\nНазвание: " + super.getName() + "\nЦвет: " + super.getColor() + "\nДлина: " + super.getLength() + "\nШирина: " + super.getWidth() + "\nВысота: " + super.getHeight();
    }
    @Override
    public void manufacturer(){
        System.out.println("Производство Германия @IKEA");
    }
}
