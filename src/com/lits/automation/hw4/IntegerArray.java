package com.lits.automation.hw4;

public class IntegerArray extends Array {

    int[] intArr = {1,5,9,8,6};

    public void sumOfAllElements(){
        int sum = 0;
        for (int element: intArr) {
            sum = sum + element;
        }
        System.out.println("Sum: " + sum);
    }

    public void averageValue(){
        int n = 0;
        for (int i : intArr){
            n = n+i;
        }
        int average = n/intArr.length;
        System.out.println("Average value: " + average);
    }

    public void sumOfEvenElements(){
        int sum1 = 0;
        for (int element: intArr) {
            if (element % 2 == 0) {
                sum1 = sum1 + element;
            }
        }
        System.out.println("Sum Of Even Elements: " + sum1);
    }
}
