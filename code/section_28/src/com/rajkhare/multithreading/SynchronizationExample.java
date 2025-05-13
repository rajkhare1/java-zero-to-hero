package com.rajkhare.multithreading;

public class SynchronizationExample {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable synchronizedTask = () -> {
            for (int i=0;i<1000;i++) {
//                counter.incrementSynchronizedByMethod();
                counter.incrementSynchronizedByBlock();
            }
        };

        Thread thread1 = new Thread(synchronizedTask);
        Thread thread2 = new Thread(synchronizedTask);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Synchronized Count value : "+counter.getCount());// Synchronized Count value : 2000
    }

}
