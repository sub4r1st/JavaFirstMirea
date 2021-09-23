package ru.mirea.task5.furniture;

import java.util.Scanner;

public class FurnitureShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Chair kyrre = new Chair("KYRRE","Белый", 799, 42, 42, 45);
        Chair eggelstad = new Chair("EGGELSTAD","Коричневый", 1999, 48, 37, 87);

        Table linnmon = new Table("LINNMON","Белый", 1999, 100, 60, 74);
        Table ingo = new Table("INGO","Белый", 1799, 75, 75, 74);

        int numberOfProduct;
        boolean arg = true;
        while (arg){
            System.out.println("\nВыберете категорию\n 1. Столы\n 2. Стулья\n 0. Выход из программы\nВведите номер: ");
            switch (in.nextInt()){
                case 1:
                    numberOfProduct = -1;
                    while (numberOfProduct != 0) {
                        System.out.println("\nВыберете товар\n 1. LINNMON\n 2. INGO\n 0. Вернуться\nВведите номер: ");
                        numberOfProduct = in.nextInt();
                        switch (numberOfProduct) {
                            case 1:
                                System.out.println(linnmon.toString());
                                linnmon.manufacturer();
                                break;
                            case 2:
                                System.out.println(ingo.toString());
                                ingo.manufacturer();
                                break;
                            case 0:
                                break;
                        }
                    }
                    continue;
                case 2:
                    numberOfProduct = -1;
                    while (numberOfProduct != 0) {
                        System.out.println("\nВыберете товар\n 1. KYRRE\n 2. EGGELSTAD\n 0. Вернуться\nВведите номер: ");
                        numberOfProduct = in.nextInt();
                        switch (numberOfProduct) {
                            case 1:
                                System.out.println(kyrre.toString());
                                kyrre.manufacturer();
                                break;
                            case 2:
                                System.out.println(eggelstad.toString());
                                eggelstad.manufacturer();
                                break;
                            case 0:
                                break;
                        }
                    }
                    continue;
                case 0:
                    System.out.println("\nВсего доброго, до новых встреч!");
                    arg = false;
                    break;
            }
        }
    }
}
