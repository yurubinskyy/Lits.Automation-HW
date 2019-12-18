package com.lits.automation.hw4;

import java.util.Arrays;

public class CharArray extends Array {

    char [] charArr = {'a', 'b', 'c', 'd', 'e'};

    public void enterCharValue (char value, int index){
        charArr[index] = value;
    }

    public void checkIfValueIsInArray (char value){
        for (char element: charArr) {
            if(element == value){
                System.out.println("Value is present in array!!!");
            }
        }
    }

    public void printCharArray() {
        System.out.println(Arrays.toString(charArr));
    }


}
