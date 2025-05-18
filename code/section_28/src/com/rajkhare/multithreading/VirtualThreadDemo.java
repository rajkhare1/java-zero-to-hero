package com.rajkhare.multithreading;

import java.util.Random;
import java.util.logging.Logger;

public class VirtualThreadDemo {

    private static Logger logger = Logger.getLogger(VirtualThreadDemo.class.getName());

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        Runnable runnable = () -> {
            double result = random.nextDouble(1000) * random.nextDouble(1000);
            logger.info("result : "+result);
        };
/* *We created below with Old Thread Model
        for (int i=0; i<500000; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
            thread.join();
        }
       long endTime = System.currentTimeMillis();
        logger.info("Total time taken : "+ (endTime - startTime));// INFO: Total time taken : 55090

 */

        // Now utilize the Virtual Thread [Java 21]
        for (int i=0; i<500000; i++) {
//                Thread.startVirtualThread(runnable).join(); // Approach 1 : create Virtual Thread
                Thread.ofVirtual().start(runnable).join();// Approach 2 : create Virtual Thread
        }
        long endTime = System.currentTimeMillis();
        logger.info("Total time taken : "+ (endTime - startTime));// Approach 1 => INFO: Total time taken : 17076
                                                                                                 // Approach 2 => INFO: Total time taken : 17244

    }

}
