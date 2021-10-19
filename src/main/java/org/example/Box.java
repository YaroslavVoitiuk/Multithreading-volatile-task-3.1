package org.example;

public class Box {
     private volatile boolean isOpen;
     private static final int SLEEP = 2000;

     public void openBox() {
          try {
               Thread.sleep(SLEEP);
               System.out.println("Box is open");
               isOpen = true;
          } catch (InterruptedException e) {
               e.printStackTrace();
          }
     }

     public void closeBox() {
          while (isOpen) {
               System.out.println("Box is closed");
               isOpen = false;
          }
     }
}
