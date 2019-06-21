package com.company;

public class Main {

    public static void main(String[] args) {
        Person vitya = new Person(120, "Vitia");
        //vitya.height = 120;
        vitya.say("George");
        System.out.println(vitya.name + "`s height is " + vitya.height);
        Person vlad = new Person();
        System.out.println(vlad.height);

        Person dima = new Person("Dima");
        System.out.println(dima.name);
        System.out.println("");

        Student freshmen = new Student(76,"Viktor", 2);
        //System.out.println(freshmen.course);
        //System.out.println(freshmen.name);
        freshmen.tell();

        Student fresh = new Student(280,"Vlad", 4);
        fresh.tell();
    }
}
