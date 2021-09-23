package ru.mirea.task5.dog;

public class Bulldog extends Dog{
    public Bulldog(String name, String color, int length) {
        super.setName(name);
        super.setColor(color);
        super.setLength(length);
    }

    public String toString() {
        return "Информация о " + this.getClass().getSimpleName() + "\nКличка: " + super.getName() + "\nОкрас: " + super.getColor() + "\nДлина в холке: " + super.getLength();
    }
    @Override
    public void historyOfAppearance(){
        System.out.println("Бульдоги появились в Англии и использовались как травильные собаки в \"кровавом спорте\";\nглавным образом в буль-бейтинге - травле быков. Отсюда и возникло название породы - \nбульдог (англ. bulldog - букв. \"бычья собака\").");
    }
}
