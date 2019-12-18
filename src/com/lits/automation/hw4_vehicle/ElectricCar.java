package com.lits.automation.hw4_vehicle;

public class ElectricCar extends Car{

    public String typeOfBattery;

    public ElectricCar(String brand, String modelName, String typeOfBattery){
        super(brand, modelName);
        this.typeOfBattery = typeOfBattery;
    }

    public void printTypeOfBattery() {
        System.out.println("Type of battery is: " + typeOfBattery);
    }
}
