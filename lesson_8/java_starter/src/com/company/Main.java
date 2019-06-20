package com.company;

public class Main {

    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
//        for (int i = 100; i > 10; i -= 10) {
//            System.out.println(i);
//        }

        boolean isTrue = true;
        int j = 0;
//        while (j < 20) {
//            System.out.println(j);
//            j += 2;
//        }
//        while (isTrue) {
//            System.out.println(j);
//            j += 2;
//            if (j > 10)
//                //isTrue = false;
//                break;
//                //return;
//                //continue;
//        }
        while (j < 100) {
            j += 1;
            if (j % 2 == 0)
                continue;
            System.out.println(j);
        }

//        int x = 13;
//        do {
//            x--;
//            System.out.println(x);
//        } while (x > 10);
    }
}
