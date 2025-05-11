package com.rajkhare.multithreading;

public class ProducerConsumerExample {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(
                () -> {
                    for (int i=1;i<=5;i++) {
                        sharedResource.produce(i);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
        producerThread.start();

        Thread consumerThread = new Thread(
                () -> {
                    for (int i=1;i<=5;i++) {
                        sharedResource.consume();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
        consumerThread.start();
    }

}

/*
Produced: 1
Consumed: 1
Produced: 2
Consumed: 2
Produced: 3
Consumed: 3
Produced: 4
Consumed: 4
Produced: 5
Consumed: 5
*/
