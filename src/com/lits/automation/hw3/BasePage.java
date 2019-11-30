package com.lits.automation.hw3;

public class BasePage {

    private String phoneNumber = "+380 67 826 62 92";
    public int numberOfCourses;
    public int numberOfTeachers;
    public int newSpecialists;

    public void setNewSpecialists(int newSpecialists) {
        this.newSpecialists = newSpecialists;
    }

    public void setNumberOfTeachers(int numberOfTeachers) {
        this.numberOfTeachers = numberOfTeachers;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    public BasePage(){

    }

    public void clickTile(String tileName)
    {
        System.out.println("You are clicking " + tileName + " tile on the home page");
    }

    public void clickExpandedList(String expandedList)
    {
        System.out.println("You are clicking " + expandedList + " tile on the home page");
    }

    public void checkMenuIcon()
    {
        System.out.println("Menu icon is present");
    }

    public void checkCityExpandedList()
    {
        System.out.println("City expanded list is present");
    }

    public void checkBecomeStudentButton()
    {
        System.out.println("'Become a student' button is present");
    }
}
