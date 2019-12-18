package com.lits.automation.hw4;

import java.util.Random;

public class MathOperation {

    public void random10Char(){
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.print((char) (rnd.nextInt(26) + 'a') + ", ");
        }
        System.out.printf("%n");
    }

    public void sumOfEvenElementsFrom1To15(){
        int sum =0;
        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println("Sum Of Even Elements From 1 to 15: " + sum);
    }

    public void checkIfValueIsDividedBy357(){
        Random rnd = new Random();
        int value = rnd.nextInt(100);
        if (value%3 == 0){
            System.out.println("Value is divided by 3");
        }else if (value%5 == 0){
            System.out.println("Value is divided by 5");
        }else if (value%5 == 0) {
            System.out.println("Value is divided by 7");
        }else{
            System.out.println("Value is not divided by 3,5,7");
        }
    }

    public void checkIfValuesIsDividedBy7Of50Cycles(){
        Random rnd = new Random();
        int sum = 0;
        for (int i = 0; i < 50; i++) {
            int value = rnd.nextInt(100);
            if (value % 7 == 0){
                sum = sum + i;
            }
        }
        System.out.println("Sum of values that divided by 7 of 50 cycles: " + sum);
    }

    public void averageFor15RandomNumbers(){
        Random rnd = new Random();
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            int value = rnd.nextInt(100);
            sum = sum + value;
        }
        int average = sum/15;
        System.out.println("Average for 15 random numbers: " + average);
    }
}
