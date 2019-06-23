package com.company;

public class Main {

    public static void main(String[] args) {
        // final - это константа
        // final если поставить перед именем класса, это значит что клас не может иметь наследников
        // final если поставть перед именем метода, значит метод нельзя переопредилить
        //final int a = 10;
        int x = Math.summ(12, 23);
        System.out.println(x);
        Math a = new Math();
        System.out.println(a.x);
        //Math.x = 24;
        a.x = 24;
        System.out.println(a.x);
        Math b = new Math();
        System.out.println(b.x);
    }
}
