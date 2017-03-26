package com.max.runnable;

/**
 * Created by Max on 3/25/2017.
 */
public class RaceCondition {

    public static void main(String[] args) throws InterruptedException {
        LongWrapper longWrapper = new LongWrapper(0L);

        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                longWrapper.incrementValue();
            }
        };

        long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[1000];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(r);
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
        long endTime = System.currentTimeMillis();


        System.out.println("Value = " + longWrapper.getValue());
        System.out.println("Time elapsed = " + (endTime - startTime) );
    }


}
