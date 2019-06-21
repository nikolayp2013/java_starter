package com.company;

public class Main {

    public static void main(String[] args) {
//        float[] array = new float[] {12.23f,354.45f};
//        float[] array = new float[] {{12.23f,354.45f},{12.23f,354.45f}};
        char[][] array = new char[3][3];
        for (int i = 0; i < array.length; i++)
            array[i] = new char[3];
        array[0][0] = 'C';
        System.out.print(array[0][0]);
    }
}
