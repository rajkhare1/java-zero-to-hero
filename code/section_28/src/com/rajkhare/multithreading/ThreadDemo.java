package com.rajkhare.multithreading;

public class ThreadDemo {

    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();

        Thread thread1 = new Thread(() -> System.out.println("Hello from Java Thread"));
        thread1.start();

        Runnable runnable = () -> System.out.println("Hi from Java Thread");
        Thread thread2 = new Thread(runnable);
        thread2.start();

        // 3 ways to creating threads
        HelloThread thread3 = new HelloThread();// Approach 1: By extending Thread class
        thread3.start();

        Thread thread4 = new Thread(new HelloThread1());// Approach 2: By implementing Runnable interface
        thread4.start();

        Thread thread5 = new Thread(Hello::sayHello);// Approach 3: By Method Reference
        thread5.start();

        System.out.println("Hello from Main Thread");

    }

}
/*
Hello from Java Thread
Hi from Java Thread
Hello from HelloThread class which extends Thread
Hello from HelloThread1 class which implements Runnable
Hello from Main Thread
Hello from Method Reference approach
*/
