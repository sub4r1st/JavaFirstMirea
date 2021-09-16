package ru.mirea.task1;

import java.util.Arrays;

public class RandArr {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 20 + 1);
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 2000 - 1000);
            if (i != (arr.length - 1)) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.println(arr[i]);
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
