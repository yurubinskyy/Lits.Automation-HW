//package com.lits.automation;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class Array {
//    int [] arr = new int[10];
//
//    public Array(){
//    }
//
//    public Array(int numberOfElements){
//        arr = new int[numberOfElements];
//    }
//
//    public void AddArrayValue(){
//        Random rand = new Random();
//        for(int i=0;i<arr.length;i++) {
//            arr[i] = rand.nextInt(100);
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public void Average(){
//        int n = 0;
//        for (int i : arr){
//            n = n+i;
//        }
//        int average = n/arr.length;
//        System.out.println("Average value: " + average);
//    }
//
//    public void MaxValue(){
//        Arrays.sort(arr);
//        int maxValue = arr[arr.length-1];
//        System.out.println("Max value: " + maxValue);
//    }
//
//    public void MinValue(){
//        Arrays.sort(arr);
//        int minValue = arr[0];
//        System.out.println("Min value: " + minValue);
//    }
//
//    public void EvenValues(){
//        int numberOfEvenValue = 0;
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]%2==0){
//                numberOfEvenValue++;
//            }
//        }
//
//        int newArr[] = new int[numberOfEvenValue];
//        int j = 0;
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]%2 == 0) {
//                newArr[j++] = arr[i];
//            }
//        }
//        System.out.println("Even Value: " + Arrays.toString(newArr));
//    }
//
//    public void OddValues(){
//        int numberOfOddValue = 0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]%2 != 0){
//                numberOfOddValue++;
//            }
//        }
//
//        int newArr[] = new int[numberOfOddValue];
//        int j = 0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]%2 != 0) {
//                newArr[j++] = arr[i];
//            }
//        }
//        System.out.println("Odd Value: " + Arrays.toString(newArr));
//    }
//
//    public void IndexOfEvenValues(){
//        int numberOfEvenValue = 0;
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]%2==0){
//                numberOfEvenValue++;
//            }
//        }
//
//        int newArr[] = new int[numberOfEvenValue];
//        int j = 0;
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]%2 == 0) {
//                newArr[j++] = i;
//            }
//        }
//        System.out.println("Index of even value: " + Arrays.toString(newArr));
//    }
//}
