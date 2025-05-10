package com.rajkhare.multithreading;

public class ThreadIdNameDemo {

    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        t3.setName("MyThread");

        System.out.println("Thread 1 ID is : "+t1.getId()+" , Name : "+t1.getName());// Thread 1 ID is : 24 , Name : Thread-0
        System.out.println("Thread 2 ID is : "+t2.threadId()+" , Name : "+t2.getName());// Thread 2 ID is : 25 , Name : Thread-1
        System.out.println("Thread 3 ID is : "+t3.threadId()+" , Name : "+t3.getName());// Thread 3 ID is : 26 , Name : MyThread
    }

}
