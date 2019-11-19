package com.lits.automation.hw3;

public class JavaAdvancedPage extends BasePage {

    public JavaAdvancedPage(){
        Check_JavaAdvancedTitle();
    }

    public void Check_JavaAdvancedTitle(){
        System.out.println("You are on the 'Java Advanced' page");
    }

    @Override
    public void Click_ExpandedList(String expandedList) {
        System.out.println("You are clicking on the " + expandedList + " expanded list on the 'Java Advance' page");
    }
}
