package com.rajkhare.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEvenOddDemo {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);

        System.out.println("Please Enter a Number and I'll tell you that is it Even or Odd!");
        String input = bf.readLine();
        int numberInput = Integer.valueOf(input);
        if (numberInput % 2 == 0) {
            System.out.println("You entered Even Number");
        } else {
            System.out.println("You entered Odd Number");
        }

        bf.close();
    }

}
