package com.lits.automation.hw3;

public class Main {

    public static void main(String[] args) {
        BasePage basePage = new BasePage();
        basePage.Click_Tile("CodeSchoolPage");
        basePage.Check_MenuIcon();
        basePage.Check_CityExpandedList();
        basePage.Check_BecomeStudentButton();
        CodeSchoolPage codeSchoolPage = new CodeSchoolPage();
        codeSchoolPage.Check_MenuIcon();
        codeSchoolPage.Check_CityExpandedList();
        codeSchoolPage.Check_BecomeStudentButton();
        codeSchoolPage.Click_Tile("Java Advance");
        JavaAdvancedPage javaAdvancedPage = new JavaAdvancedPage();
        javaAdvancedPage.Click_ExpandedList("Curriculum");
    }
}
