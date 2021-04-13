package com.hau.o.horse;

public class HorseRunable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("RR " +  i);
        }
    }
}
