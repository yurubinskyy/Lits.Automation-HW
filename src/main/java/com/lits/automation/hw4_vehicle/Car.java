package com.lits.automation.hw4_vehicle;

public class Car extends Vehicle{
    public String modelName;

    public Car(String brand, String modelName){
        super(brand);
        this.modelName = modelName;
    }

    public void printModelName() {
        System.out.println("The model name is: " + modelName);
    }
}
