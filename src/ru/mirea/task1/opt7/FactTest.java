package ru.mirea.task1.opt7;

import java.util.Scanner;

public class FactTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        System.out.println(i + "! = " + fact(i));
    }

    public static int fact(int x){
        int x1 = 1;
        for (int i = 1; i <= x; i++){
            x1 *= i;
        }
        return x1;
    }
}
