package ru.mirea.task10.task16;

import java.util.Scanner;

public class MaxNumber {
    public static void InputAndCountOfNumbers(){
        Scanner input = new Scanner(System.in);
        int num;
        int maxNum = 0;
        while (true){
            num = input.nextInt();
            if (num == 0){
                break;
            }
            if (num > maxNum){
                maxNum = num;
            }
        }
        System.out.println(maxNum);
    }
}
