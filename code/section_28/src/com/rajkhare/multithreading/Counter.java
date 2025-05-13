package com.rajkhare.multithreading;

public class Counter {

    private int count = 0;

    public void incrementUnSynchronized() {
        count++;
    }

    public synchronized void incrementSynchronizedByMethod() {
        count++;
    }

    public  void incrementSynchronizedByBlock() {
        synchronized (Counter.class){
            count++;
        }

    }

    public int getCount() {
        return count;
    }
}
