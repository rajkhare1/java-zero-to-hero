package com.rajkhare.multithreading;

public class ThreadPriorityDemo {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new PriorityExample("Thread A"));
        Thread thread2 = new Thread(new PriorityExample("Thread B"));
        Thread thread3 = new Thread(new PriorityExample("Thread C"));

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();



    }

}

/*
 Thread A - Count : 0, Priority : 1
Thread C - Count : 0, Priority : 10
Thread B - Count : 0, Priority : 5
Thread C - Count : 1, Priority : 10
Thread B - Count : 1, Priority : 5
Thread A - Count : 1, Priority : 1
Thread B - Count : 2, Priority : 5
Thread A - Count : 2, Priority : 1
Thread C - Count : 2, Priority : 10
Thread B - Count : 3, Priority : 5
Thread C - Count : 3, Priority : 10
Thread A - Count : 3, Priority : 1
Thread B - Count : 4, Priority : 5
Thread A - Count : 4, Priority : 1
Thread C - Count : 4, Priority : 10
Thread B - Count : 5, Priority : 5
Thread A - Count : 5, Priority : 1
Thread C - Count : 5, Priority : 10
 */

// So don't be an assumption that always highest priority Threads will run first, JVM has their own mechanism
