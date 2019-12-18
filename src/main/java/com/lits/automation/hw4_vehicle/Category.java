package com.lits.automation.hw4_vehicle;

public class Category extends Sedan {
    public String categoty;

    public Category(String brand, String modelName, String typeOfBattery, int numberOfSeats, String category){
        super(brand, modelName, typeOfBattery, numberOfSeats);
        this.categoty = category;
    }

    public void prinTypeOfRace() {
        System.out.println("Category: " + categoty);
    }

    @Override
    public void color() {
        System.out.println("Color is black");
    }
}
