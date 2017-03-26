package com.max.runnable;

/**
 * Created by Max on 3/25/2017.
 */
public class LongWrapper {

    private long l;
    private final Object key = new Object();

    public LongWrapper(long l) {
        this.l = l;
    }

    // synchronized to create happens before link with incrementValue()
    public long getValue() {
        synchronized (key) {
            return l;
        }
    }

    public void incrementValue() {
        synchronized (key) {
            l++;
        }
    }
}
