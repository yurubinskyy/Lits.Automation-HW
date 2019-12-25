package com.company;

public class ProjectManager extends Person{
    String primaryLanguage;

    public ProjectManager(String name, int age, String primarySkill) {
        super(name,age);
        this.primaryLanguage = primarySkill;
    }

    @Override
    public void whoAmIm() {
        System.out.println("I am PM, my age is:" + age);
    }
}
