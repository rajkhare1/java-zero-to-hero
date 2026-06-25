package com.rajkhare.concurrency;

public class MyFirstThread {

    static void main() {
        Task task = new Task();
        Thread thread = new Thread(task);// NEW
        thread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Inside main ...");
    }
}

class Task implements Runnable {

    @Override
    public void run() {
        System.out.println("Inside run ...");
        go();
    }

    private void go() {
        System.out.println("Inside go ...");
        more();
    }

    private void more() {
        System.out.println("Inside more ...");
    }
}