package org.example;

public class Box {
    private volatile boolean isOpen;
    private static final int SLEEP = 2000;
    private static final int CYCLES_QUAN = 3;
    private int currCycleVal = 0;
    private boolean isWorking = true;


    public void openBox() {
        try {
            while (currCycleVal != CYCLES_QUAN) {
                if (!isOpen) {
                    isOpen = true;
                    System.out.println("Box is open");
                    currCycleVal++;
                    Thread.sleep(SLEEP);
                }
            }
            isWorking = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void closeBox() {
        while (isWorking) {
            if (isOpen) {
                isOpen = false;
                System.out.println("Box is closed");
            }
        }
    }
}
