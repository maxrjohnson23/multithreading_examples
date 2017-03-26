package com.max.runnable;

/**
 * Created by Max on 3/25/2017.
 */
public class FirstRunnable {

    public static void main(String[] args) {

        Runnable runnable  = () -> {
            System.out.println("I am running in " + Thread.currentThread().getName());
        };

        Thread t = new Thread(runnable);
        t.setName("My Thread");
        t.start();
        //t.run(); do not use, this calls the same thread

    }

}
