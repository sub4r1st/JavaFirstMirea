package ru.mirea.task5.dog;

public class Spaniel extends Dog{
    public Spaniel(String name, String color, int length) {
        super.setName(name);
        super.setColor(color);
        super.setLength(length);
    }

    public String toString() {
        return "Информация о " + this.getClass().getSimpleName() + "\nКличка: " + super.getName() + "\nОкрас: " + super.getColor() + "\nДлина в холке: " + super.getLength();
    }

    @Override
    public void historyOfAppearance(){
        System.out.println("Собаки типа спаниелей происходят из Испании, поскольку само это слово означает \"испанский\". \nОсновным предназначением и охотничьей специализацией спаниелей была добыча пернатой дичи из \nгустых зарослей. К концу XVII века спаниелей разделили на тех, которые охотились на \nсухопутную дичь и на водяную.");
    }
}
