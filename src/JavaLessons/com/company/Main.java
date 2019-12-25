package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       Person person = new Person("Jack", 25);

//       Person person1 = person.getPerson();
//
//       System.out.println(person1.name);
//       System.out.println(person.age);

       person.whoAmIm();
        System.out.println(person.getAge());

//        int i = 0;
//        while (i<10) {
//            i++;
//            if (i%2 ==0){
//                System.out.println(i);
//            }
//        }

        Person developer = new Developer("Bill",20, "Java" );
        developer.whoAmIm();
        developer = new ProjectManager("Jack", 30, "German");


        developer.setName("Tom");
        developer.whoAmIm();


    }
}
