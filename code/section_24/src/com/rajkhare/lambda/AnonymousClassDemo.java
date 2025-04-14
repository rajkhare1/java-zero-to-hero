package com.rajkhare.lambda;

public class AnonymousClassDemo {

    public static void main(String[] args) {
        Hello hello = new Hello() {
            @Override
            public void sayHello() {
                System.out.println("Anonymous");
            }
        };// Approach 1
        process(hello);
        process(new Hello() {
            @Override
            public void sayHello() {
                System.out.println("Anonymous 1");
            }
        });// Approach 2
    }

    public static void process(Hello h) {
        h.sayHello();
    }

}
