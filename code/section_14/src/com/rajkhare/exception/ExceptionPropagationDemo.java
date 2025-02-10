package com.rajkhare.exception;

import java.io.FileNotFoundException;
import java.util.logging.Logger;

public class ExceptionPropagationDemo {

    private static Logger logger = Logger.getLogger(ExceptionPropagationDemo.class.getName());

    public static void main(String[] args) {
        try {
            method1();
        } catch (FileNotFoundException ex) {
            logger.severe(ex.getMessage());
        }
        logger.info("Main method");
    }

    static void method1() throws FileNotFoundException {
        method2();
    }

    static void method2() throws FileNotFoundException{
            method3();

    }

    static void method3() throws FileNotFoundException {
        method4();
    }

    static void method4() throws FileNotFoundException {
        method5();
    }

    static void method5() throws FileNotFoundException {
        throw new FileNotFoundException("File not found. Please check...");
    }

}
