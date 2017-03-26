package com.max.singleton;

/**
 * Synchronized Singleton Pattern
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    // Add synchronization to prevent multiple threads from accessing
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
