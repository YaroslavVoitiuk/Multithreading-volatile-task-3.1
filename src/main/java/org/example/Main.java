package org.example;


public class Main {

    public static void main(String[] args) {
        Box box = new Box();

        Thread thread1 = new Thread(box::openBox, "user");
        Thread thread2 = new Thread(box::closeBox, "box");

        thread1.start();
        thread2.start();


    }
}
