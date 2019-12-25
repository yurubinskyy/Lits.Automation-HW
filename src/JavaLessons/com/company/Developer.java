package com.company;

public class Developer extends Person {
    String primarySkill;

    public Developer(String name, int age, String primarySkill) {
        super(name,age);
        this.primarySkill = primarySkill;
    }

    @Override
    public void  whoAmIm(){
        System.out.println("I am developer, my age is:" + age);
    }
}
