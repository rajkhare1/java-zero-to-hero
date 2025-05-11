package com.rajkhare.multithreading;

public class JoinExample {

    public static void main(String[] args) {
        Thread threadA = new Thread(
                () -> {
                    for(int i=0;i<=5;i++) {
                        System.out.println("Thread A - count: "+ i);
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
        threadA.start();
        // to ask main thread to wait until threadA completes it's execution
        try {
            threadA.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread ended");
    }

}

/* due to magic of join(), main thread completed after threadA execution:
output:
Thread A - count: 0
Thread A - count: 1
Thread A - count: 2
Thread A - count: 3
Thread A - count: 4
Thread A - count: 5
Main thread ended

*/
