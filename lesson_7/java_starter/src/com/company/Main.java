package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new  Scanner(System.in);
        int first, second = 50;
        boolean isTrue = false;
        System.out.print("Enter first num: ");
        first = num.nextInt();

        //isTrue = first == 51 ? true : false;
        isTrue = first == 51;
        //second = first == 51 ? 23 : 45;

//        if (first == 10)
//            System.out.print("Num is 10");
        if (first >= second && isTrue) { // True
            System.out.println("Num is 10");
            System.out.println("\n");
        } else if (first == 45)
            System.out.println("Num is equal 45");
        else {
            System.out.println("Num is lower then " + second);
        }

        switch (first) {
            case 51:
                System.out.print("Num is equal 51");
                break;
            case 48:
                System.out.print("Num is equal 48");
                break;
            case 57:
                System.out.print("Num is equal 57");
                break;
            default:
                System.out.print("Num is equal something");
        }
    }
}
