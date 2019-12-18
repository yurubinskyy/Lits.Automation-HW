package com.lits.automation.hw4;

public class Main {

    public static void main(String[] args) {

        Array array = new Array();
        array.AddArrayValue();
        array.printElements();
        array.sumOddIndex();

        CharArray charArray = new CharArray();
        charArray.enterCharValue('f', 1);
        charArray.checkIfValueIsInArray('f');
        charArray.printCharArray();

        IntegerArray integerArray = new IntegerArray();
        integerArray.averageValue();
        integerArray.sumOfAllElements();
        integerArray.sumOfEvenElements();


        MathOperation mathOperation = new MathOperation();
        mathOperation.random10Char();
        mathOperation.sumOfEvenElementsFrom1To15();
        mathOperation.checkIfValueIsDividedBy357();
        mathOperation.checkIfValuesIsDividedBy7Of50Cycles();
        mathOperation.averageFor15RandomNumbers();
    }
}
