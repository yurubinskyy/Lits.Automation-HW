package com.lits.automation.hw4_vehicle;

public class Sedan extends ElectricCar{

    public int numberOfSeats;

    public Sedan(String brand, String modelName, String typeOfBattery, int numberOfSeats){
        super(brand, modelName, typeOfBattery);
        this.numberOfSeats = numberOfSeats;
    }

    public void printSedanCharacteristics() {
        System.out.println("Number of seats: " + numberOfSeats + " seats");
    }
}
