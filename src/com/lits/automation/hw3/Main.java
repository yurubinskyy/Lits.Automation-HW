package com.lits.automation.hw3;

public class Main {

    public static void main(String[] args) {
        BasePage basePage = new BasePage();
        basePage.clickTile("CodeSchoolPage");
        basePage.checkMenuIcon();
        basePage.checkCityExpandedList();
        basePage.checkBecomeStudentButton();
        CodeSchoolPage codeSchoolPage = new CodeSchoolPage();
        codeSchoolPage.checkMenuIcon();
        codeSchoolPage.checkCityExpandedList();
        codeSchoolPage.checkBecomeStudentButton();
        codeSchoolPage.clickTile("Java Advance");
        JavaAdvancedPage javaAdvancedPage = new JavaAdvancedPage();
        javaAdvancedPage.clickExpandedList("Curriculum");
    }
}
