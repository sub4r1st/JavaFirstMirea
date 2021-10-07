package ru.mirea.task10.task15;

import java.util.Scanner;

public class CountOfMaxNumber {
    public static void InputAndCountOfNumbers(){
        Scanner input = new Scanner(System.in);
        int num;
        int maxNum = 0;
        int counter = 0;
        while (true){
            num = input.nextInt();
            if (num == 0){
                break;
            }
            if (num > maxNum){
                maxNum = num;
                counter = 1;
            } else if(num == maxNum){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
