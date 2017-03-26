package com.max.singleton;

/**
 * Synchronized Singleton Pattern
 */
public class Singleton {

    // Make volative to create happens before link
    private static volatile Singleton instance;
    private static final Object key = new Object();

    private Singleton() {}

    // Attempt to fix for multicore CPUs to prevent synchronizing the read operation
    // Fix is error prone because a read can happen on a partially built instance
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
