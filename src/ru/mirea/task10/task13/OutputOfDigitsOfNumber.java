package ru.mirea.task10.task13;

import java.util.Scanner;

public class OutputOfDigitsOfNumber {
    public static void InputOfNumber(){
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        OutputOfDigits(in);
    }
    static void OutputOfDigits(int x){
        if (x > 9){
            OutputOfDigits(x / 10);
        }
        System.out.println(x % 10);
    }
}
