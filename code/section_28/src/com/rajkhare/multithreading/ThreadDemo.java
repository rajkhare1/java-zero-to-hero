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

        System.out.println("Hello from Main Thread");

    }

}
