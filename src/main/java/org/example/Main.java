package org.example;


public class Main {
    public static final int CYCLE_QUANT = 3;
    public static void main( String[] args ) throws InterruptedException {
        Box box = new Box();

        for (int i = 0; i < CYCLE_QUANT; i++){
            Thread thread1 = new Thread(box::openBox,"user");
            Thread thread2 = new Thread(box::closeBox,"box");
            thread1.start();
            thread1.join();
            thread2.start();
            thread2.join();
        }


    }
}
