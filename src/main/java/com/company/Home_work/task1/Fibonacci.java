package com.company.Home_work.task1;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String [] args){
        int a = 0;
        int b = 1;
        int sum;
        System.out.println("enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            sum = a + b;
            a = b;
            b = sum;
        }
    }
}
