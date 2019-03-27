package com.company.Home_work.task2;

import java.util.Arrays;

public class JavaMethodSort {
    public static void main(String[] args) {
        int[] array = new int[1_000_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 1_000_000));
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        long timeSpent = System.currentTimeMillis();
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");
    }
}
