package ru.mirea.task6.nameable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        Subaru subaru = new Subaru();
        ArrayList<Nameable> companies = new ArrayList<>();
        companies.add(toyota);
        companies.add(subaru);
        Nameable nameable = subaru;
        subaru = (Subaru) nameable;
        subaru.tostring();
        for (Nameable company:
             companies) {
            System.out.println(company.getName());
        }
    }
}
