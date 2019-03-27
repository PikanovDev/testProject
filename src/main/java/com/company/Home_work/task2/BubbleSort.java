package com.company.Home_work.task2;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = new int[1_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 1_000));
        }
        System.out.println(Arrays.toString(buble(array)));
        long timeSpent = System.currentTimeMillis();
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");
    }

    public static int[] buble(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
}