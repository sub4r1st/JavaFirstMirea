package ru.mirea.task10.task14;

import java.util.Scanner;

public class ReversOutputOfDigitsOfNumber {
    public static void InputOfNumber(){
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        OutputOfDigits(in);
    }
    static void OutputOfDigits(int x){
        System.out.println(x % 10);
        if (x > 9){
            OutputOfDigits(x / 10);
        }
    }
}
