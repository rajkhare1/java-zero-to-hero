package com.rajkhare.multithreading;

public class SumOfIntsThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        long result;
        SumThread thread1 = new SumThread(0, Integer.MAX_VALUE/2);
        SumThread thread2 = new SumThread((Integer.MAX_VALUE/2)+1, Integer.MAX_VALUE);
        thread1.start();
        thread2.start();
        // to tell Main thread to wait until thread1 and thread2 will be completed
        thread1.join();
        thread2.join();
        result = thread1.getResult() + thread2.getResult();
        System.out.println(result);// 2305843008139952128
        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken by multiple thread Java class is : "+ (endTime - startTime));// Total time taken by multiple thread Java class is : 581
    }

}
