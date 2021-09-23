package ru.mirea.task5.dog;

public class Main {
    public static void main(String[] args) {
        Bulldog bulldog = new Bulldog("Роджер", "белый с коричневыми пятнами", 50);
        System.out.println(bulldog.toString());
        bulldog.historyOfAppearance();

        System.out.println();
        Spaniel spaniel = new Spaniel("Ума", "черный с белыми пятнами", 35);
        System.out.println(spaniel.toString());
        spaniel.historyOfAppearance();
    }
}
