package com.lits.automation.hw4_vehicle;

public class Vehicle {

    public String brand;

    public Vehicle(String brand){
        this.brand = brand;
    }

    public void color(){
        System.out.println("Color is red");
    }

    public void printBrand() {
        System.out.println("Vehicle brand is:" + brand);
    }
}
