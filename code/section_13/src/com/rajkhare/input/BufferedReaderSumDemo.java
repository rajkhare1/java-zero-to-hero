package com.rajkhare.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderSumDemo {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf  = new BufferedReader(isr);

        System.out.println("Hey Sia Khare, I'll give you the sum of two numbers!!!");

        System.out.println("Please enter the first number...");
        String input1 = bf.readLine();

        System.out.println("Please enter the second number...");
        String input2 = bf.readLine();

        int number1 = Integer.parseInt(input1);
        int number2 = Integer.parseInt(input2);

        int sum = number1 + number2;
        System.out.println("The sum of two given number is : "+sum);

        bf.close();
    }

}
