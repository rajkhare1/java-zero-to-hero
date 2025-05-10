package com.rajkhare.multithreading;

public class CurrentThreadDemo {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.threadId());// 1
        System.out.println(mainThread.getName());// main
    }

}
