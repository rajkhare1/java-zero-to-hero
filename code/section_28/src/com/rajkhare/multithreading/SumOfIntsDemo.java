package com.rajkhare.multithreading;

public class SumOfIntsDemo {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long result = 0;
        for (long i=0;i<=Integer.MAX_VALUE;i++) {
            result = result + i;
        }
        System.out.println(result);// 2305843008139952128
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time taken by normal Java class is: "+(endTime - startTime));// Total Time taken by normal Java class is: 687
    }

}
