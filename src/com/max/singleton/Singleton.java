package com.max.singleton;

/**
 * Synchronized Singleton Pattern
 */
public class Singleton {

    private static Singleton instance;
    private static final Object key = new Object();

    private Singleton() {}

    // Attempt to fix for multicore CPUs to prevent synchronizing the read operation
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        synchronized (key) {
            if (instance != null) {
                instance = new Singleton();
            }
            return instance;
        }
    }
}
