package com.lits.automation.hw3;

public class CodeSchoolPage extends BasePage {

    public CodeSchoolPage(){
        Check_CodeSchoolTitle();
    }

    public void Check_CodeSchoolTitle(){
        System.out.println("You are on the 'Code School' page");
    }

    @Override
    public void Click_Tile(String tileName) {
        System.out.println("You are clicking " + tileName + " tile on the 'Code School' page");
    }

    @Override
    public void Check_MenuIcon()
    {
        System.out.println("Menu icon is present on the 'Code School' page");
    }

    @Override
    public void Check_CityExpandedList()
    {
        System.out.println("City expanded list is present on the 'Code School' page");
    }

    @Override
    public void Check_BecomeStudentButton()
    {
        System.out.println("'Become a student' button is present on the 'Code School' page");
    }
}
