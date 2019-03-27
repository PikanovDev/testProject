package com.company.Home_work.task2;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(doFactorial(16));
    }

    public static BigInteger doFactorial(int value) {
        BigInteger factorial = BigInteger.ONE;
        if (value >= 1) {
            for (int i = 1; i <= value; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            return factorial;
        } else if (value == 0) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(-1);
        }
    }
    }
