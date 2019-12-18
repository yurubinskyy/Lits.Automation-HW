package com.lits.automation.hw3;

public class JavaAdvancedPage extends BasePage {

    public JavaAdvancedPage(){
        checkJavaAdvancedTitle();
    }

    public void checkJavaAdvancedTitle(){
        System.out.println("You are on the 'Java Advanced' page");
    }

    @Override
    public void clickExpandedList(String expandedList) {
        System.out.println("You are clicking on the " + expandedList + " expanded list on the 'Java Advance' page");
    }
}
