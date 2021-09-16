package ru.mirea.task1;

public class Sums {
    public static void main(String[] args) {
        int[] arr = {12, 4, 344, 2344, 123, 124, 53, 542, 234};
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
        sum = 0;
        int j = 0;
        while (j < arr.length) {
            sum += arr[j];
            j++;
        }
        System.out.println(sum);
        sum = 0;
        int k = 0;
        do {
            sum += arr[k];
            k++;
        } while (k < arr.length);
        System.out.println(sum);
    }
}
