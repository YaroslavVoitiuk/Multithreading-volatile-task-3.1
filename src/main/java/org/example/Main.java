package org.example;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        Box box = new Box();

        Thread thread1 = new Thread(box::openBox, "user");
        Thread thread2 = new Thread(box::closeBox, "box");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}
