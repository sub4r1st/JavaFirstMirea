package ru.mirea.task1;

import java.util.Scanner;

public class PrintArgs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i < 6; i++){
            System.out.println(input.next());
        }
    }
}
