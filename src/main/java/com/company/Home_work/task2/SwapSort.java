package com.company.Home_work.task2;



public class SwapSort {
    public static void main(String[] args) {
        int[] array = new int[1_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 1_000));
        }
        //Arrays.toString(countingSort(array));
        long timeSpent = (System.currentTimeMillis() / 1000);
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");
    }

    public static int[] countingSort(int[] arr, int min, int max){
        int[] count= new int[max - min + 1];
        for(int number : arr){
            count[number - min]++;
        }
        int z= 0;
        for(int i= min;i <= max;i++){
            while(count[i - min] > 0){
                arr[z]= i;
                z++;
                count[i - min]--;
            }
        }
        return count;
    }

}
