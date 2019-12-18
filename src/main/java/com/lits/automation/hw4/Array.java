package com.lits.automation.hw4;

import java.util.Arrays;
import java.util.Random;

public class Array {
    int [] arr = new int [5];
    int test;

    public void printElements(){
        System.out.println(Arrays.toString(arr));
    }

    public void AddArrayValue(){
        Random rand = new Random();
        for(int i=0;i<arr.length;i++) {
            arr[i] = rand.nextInt(100);
        }
    }

    public void sumOddIndex(){
        int sumOddIndex = 0;
        for(int i=0;i<arr.length;i++){
            if(i % 2 != 0){
                sumOddIndex = sumOddIndex + arr[i];
            }
        }
        System.out.println(sumOddIndex);
    }

}
