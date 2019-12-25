package com.company;

public class Person {
    private String name;
    int age;



//    public Person (){
//    }

    public Person (String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void whoAmIm(){
        System.out.println("My name is:" + name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
