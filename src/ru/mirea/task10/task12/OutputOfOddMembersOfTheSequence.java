package ru.mirea.task10.task12;

import java.util.Scanner;

public class OutputOfOddMembersOfTheSequence {
    public static void OutputOfOddMembers(){
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int member;
        while (true){
            counter++;
            member = input.nextInt();
            if ((counter % 2 == 1) && (member != 0)){
                System.out.println(member);
            }else if (member == 0){
                break;
            }
        }
    }
}
