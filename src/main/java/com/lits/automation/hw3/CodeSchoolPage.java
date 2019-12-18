package com.lits.automation.hw3;

public class CodeSchoolPage extends BasePage {

    public CodeSchoolPage(){
        checkCodeSchoolTitle();
    }

    public void checkCodeSchoolTitle(){
        System.out.println("You are on the 'Code School' page");
    }

    @Override
    public void clickTile(String tileName) {
        System.out.println("You are clicking " + tileName + " tile on the 'Code School' page");
    }

    @Override
    public void checkMenuIcon()
    {
        System.out.println("Menu icon is present on the 'Code School' page");
    }

    @Override
    public void checkCityExpandedList()
    {
        System.out.println("City expanded list is present on the 'Code School' page");
    }

    @Override
    public void checkBecomeStudentButton()
    {
        System.out.println("'Become a student' button is present on the 'Code School' page");
    }
}
