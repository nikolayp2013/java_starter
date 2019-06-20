package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new  Scanner(System.in);
//        int first, second, result;
//        System.out.print("Enter first num: ");
//        first = num.nextInt();
//        System.out.print("Enter second num: ");
//        second = num.nextInt();
//        result = first + second;
//        System.out.println("Result is - " + result);
        float first, second, result;
        System.out.print("Enter first num: ");
        first = num.nextFloat();
        System.out.print("Enter second num: ");
        second = num.nextFloat();
        //result = first % second; // % - остаток от деления
        result = first + second;
        //result = result / 2;
        //result /= 2;
        //result += 2;
        //result *= 2;
        //result += 1;
        //result ++;
        result --;
        System.out.println("Result is - " + result);
    }
}
