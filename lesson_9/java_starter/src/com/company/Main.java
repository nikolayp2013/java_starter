package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int[] name = new int[5];
//        int[] name = new int[] {23,34,56};
//        float[] name = new float[] {23.23f,34.12f,56.23f};
//        System.out.print(name[1]);
        int[] a;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers of array: ");
        n = in.nextInt();
        a = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a[" + i + "] = ");
            a[i] = in.nextInt();
        }
    }
}
