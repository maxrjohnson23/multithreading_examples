package com.max.runnable;

/**
 * Created by Max on 3/25/2017.
 */
public class LongWrapper {

    private long l;
    private Object key = new Object();

    public LongWrapper(long l) {
        this.l = l;
    }

    public long getValue() {
        return l;
    }
    public void incrementValue() {
        synchronized (key) {
            l++;
        }
    }
}
