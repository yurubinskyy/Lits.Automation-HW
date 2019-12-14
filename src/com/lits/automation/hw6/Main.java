package com.lits.automation.hw6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        //Exercise1

        String [] codeSchoolCourses = {"Front-End base", "True Devops", "Java Advance",
                "Base curse C#", "РОЗРОБКА ПІД ANDROID", "РОЗРОБКА ПІД IOS", "JAVA BASE", "PYTHON", "WEB UI ADVANCED"};

        ArrayList<String> codeSchool = new ArrayList();

        for (int i = 0; i < codeSchoolCourses.length; i++) {
            codeSchool.add(codeSchoolCourses[i]);
            System.out.println(codeSchool.get(i));
        }

        //Exercise2

        Teacher t1 = new Teacher("ARTEM", "KOSENKO");
        Teacher t2 = new Teacher("KOSTIANTYN", "SEVERENCHUK");
        Teacher t3 = new Teacher("LEG", "SVIRSKYI");
        Teacher t4 = new Teacher("PETRO", "GALUSHCHAK");
        Teacher t5 = new Teacher("YEVHEN", "FILYAK");
        Teacher t6 = new Teacher("АЛІНА", "ГРИНЬКО");
        Teacher t7 = new Teacher("АЛЬОНА", "ГАРНЕЦЬ");
        Teacher t8 = new Teacher("АНАСТАСІЯ", "ФРОЛОВА");
        Teacher t9 = new Teacher("АНДРІЙ", "ГАСЮК");
        Teacher t10 = new Teacher("АНДРІЙ", "КОНДРАТІКОВ");
        TreeSet<Teacher> sortedTeachers = new TreeSet();
        sortedTeachers.add(t1);
        sortedTeachers.add(t2);
        sortedTeachers.add(t3);
        sortedTeachers.add(t4);
        sortedTeachers.add(t5);
        sortedTeachers.add(t6);
        sortedTeachers.add(t7);
        sortedTeachers.add(t8);
        sortedTeachers.add(t9);
        sortedTeachers.add(t10);

        Iterator<Teacher> iterator = sortedTeachers.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Exercise3

        News n1 = new News("LITS серед партнерів проекту «Lviv MUN»","12/10/2017");
        News n2 = new News("LITS провів воркшоп з 3D-візуалізації для вчителів львівських шкіл","18/12/2017");
        News n3 = new News("Тепер ви маєте можливість оплачувати курси в LITS у розстрочку!",
                "03/04/2018");

        LinkedHashSet<News> listOfNews = new LinkedHashSet<>();
        listOfNews.add(n3);
        listOfNews.add(n2);
        listOfNews.add(n1);

        Iterator<News> iterator2 = listOfNews.iterator();

        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }




    }
}
