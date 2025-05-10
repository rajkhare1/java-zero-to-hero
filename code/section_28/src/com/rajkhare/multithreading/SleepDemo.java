package com.rajkhare.multithreading;

public class SleepDemo {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        for (int i=0;i<5;i++) {
            System.out.println("Hello from Main method : " + i); /* Hello from Main method : 0
Hello from Main method : 1
Hello from Main method : 2
Hello from Main method : 3
Hello from Main method : 4 */
            Thread.sleep(1000);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken : "+ (endTime-startTime));// Total time taken : 5033
    }

}
