package ru.mirea.task23;

public class Automobile {
    private int year = 0;
    private String mark = "";
    private String model ="";
    public Automobile(int year, String mark, String model){
        this.year = year;
        this.mark = mark;
        this.model = model;
    }
    public int hashCode() {
        int result = model == null ? 0 : model.hashCode();
        result = 31 * result + year;
        return result;
    }

    public static void main(String[] args){
        Automobile smart1 = new Automobile(2016, "Toyota", "Camry");
        Automobile smart2 = new Automobile(2021, "Kia", "RIO");
        Automobile smart3 = new Automobile(2017, "Hummer", "H1");
        Automobile smart4 = new Automobile(2021, "Nissan", "350Z");
        Automobile smart5 = new Automobile(2018, "Toyota", "Alphard");
        //сравнение объектов
        if(smart1.hashCode()==smart1.hashCode()) {
            System.out.println("Автомобиль " + smart1.mark + " " + smart1.model + " равен автомобилю " + smart5.mark + " " + smart5.model);
        }
        else System.out.println("Автомобиль " + smart1.mark + " " + smart1.model + " НЕ равен автомобилю " + smart5.mark + " " + smart5.model);
        System.out.println("Хеш-код Автомобиля " + smart1.mark + " " + smart1.model+  ": " + smart1.hashCode());
        System.out.println("Хеш-код Автомобиля " + smart5.mark + " " + smart5.model+  ": " + smart5.hashCode());
        System.out.println("");
        if(smart1.hashCode()==smart2.hashCode()) {
            System.out.println("Автомобиль " + smart1.mark + " " + smart1.model + " равен Автомобильу " + smart2.mark + " " + smart2.model);
        }
        else System.out.println("Автомобиль " + smart1.mark + " " + smart1.model + " НЕ равен Автомобилю " + smart2.mark + " " + smart2.model);
        System.out.println("Хеш-код Автомобиля " + smart1.mark + " " + smart1.model+  ": " + smart1.hashCode());
        System.out.println("Хеш-код Автомобиля " + smart2.mark + " " + smart2.model+  ": " + smart2.hashCode());
        System.out.println("");
        if(smart1.hashCode()==smart3.hashCode()) {
            System.out.println("Автомобиль " + smart1.mark + " " + smart1.model + " равен автомобилю " + smart3.mark + " " + smart3.model);
        }
        else System.out.println("Автомобиль " + smart1.mark + " " + smart1.model + " НЕ равен автомобилю " + smart3.mark + " " + smart3.model);
        System.out.println("Хеш-код автомобиля " + smart1.mark + " " + smart1.model+  ": " + smart1.hashCode());
        System.out.println("Хеш-код автомобиля " + smart3.mark + " " + smart3.model+  ": " + smart3.hashCode());
        System.out.println("");
        if(smart1.hashCode()==smart4.hashCode()) {
            System.out.println("Автомобиль " + smart1.mark + " " + smart1.model + " равен автомобилю " + smart4.mark + " " + smart4.model);
        }
        else System.out.println("Автомобиль " + smart1.mark + " " + smart1.model + " НЕ равен автомобилю " + smart4.mark + " " + smart4.model);
        System.out.println("Хеш-код автомобиля " + smart1.mark + " " + smart1.model+  ": " + smart1.hashCode());
        System.out.println("Хеш-код автомобиля " + smart5.mark + " " + smart4.model+  ": " + smart4.hashCode());


    }
}
