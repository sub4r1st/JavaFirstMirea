package ru.mirea.task5.dish;

public class FlatPlate extends Dish{
    public FlatPlate(String company, String color, int yearOfRelease) {
        super.setCompany(company);
        super.setColor(color);
        super.setYearOfRelease(yearOfRelease);
    }

    public String toString() {
        return "Информация о " + this.getClass().getSimpleName() + "\nПроизводитель: " + super.getCompany() + "\nЦвет: " + super.getColor() + "\nГод начала производства: " + super.getYearOfRelease();
    }
    @Override
    public void eating(){

        System.out.println("Пользователь ест из плоской тарелки");
    }

}
