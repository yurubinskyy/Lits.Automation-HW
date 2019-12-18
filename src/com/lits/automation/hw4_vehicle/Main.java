package com.lits.automation.hw4_vehicle;

public class Main {
    public static void main(String[] args) {

        Category category = new Category("Tesla"," Model S",
                "100 kWh", 5, "Sport");
        category.printBrand();
        category.printModelName();
        category.printTypeOfBattery();
        category.printSedanCharacteristics();
        category.prinTypeOfRace();
        category.color();

    }
}
