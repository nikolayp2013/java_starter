package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int temp = func (3, 4);
//        System.out.print(temp);
//        func (3, 4);
        int [] a= readArray();
        System.out.println("Выводим введенный массив элементов: ");
        for (int i = 0; i < a.length; i++)
            System.out.println("Элемент " + (i + 1) + ": " + a[i]);
    }

    public static int[] readArray () {
        int[] arr;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во элементов массива: ");
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент: ");
            arr[i] = in.nextInt();
        }
        return arr;
    }

//    public static int func (int a, int b) {
//        int result = 1;
//        for (int i = 0; i < b; i++)
//            result *= a;
//        return result;
//    }
    public static void func (int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++)
            result *= a;
        System.out.print(result);
    }
}
