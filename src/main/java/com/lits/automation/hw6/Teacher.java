package com.lits.automation.hw6;

public class Teacher implements Comparable<Teacher> {
    private String firstName;
    private String secondName;

    public Teacher(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName = " + firstName +
                ", secondName = " + secondName +
                '}';
    }


    @Override
    public int compareTo(Teacher teacher) {
        return teacher.firstName.compareTo(this.firstName) -
                teacher.secondName.compareTo(this.secondName);
    }
}

