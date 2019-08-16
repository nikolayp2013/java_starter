package com.company;

public class Main {

    public static void main(String[] args) {
        // вложенные классы
//        Computer comp = new Computer();
//        comp.i7.start();
//        comp.transfer.start();
//        comp.transfer.shutdown();
        // ананимный класс
        new Computer() {
            void super_comp () {
                this.i7.start();
                this.transfer.start();
            }
        };
    }
}
