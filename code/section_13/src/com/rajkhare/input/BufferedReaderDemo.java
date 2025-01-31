package com.rajkhare.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Please enter a value...");
        String input = bufferedReader.readLine();
        System.out.println("The user entered the value: "+input);
        bufferedReader.close();
    }

}
