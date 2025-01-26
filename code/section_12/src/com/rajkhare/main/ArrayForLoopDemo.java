package com.rajkhare.main;

public class ArrayForLoopDemo {

    public static void main(String[] args) {
        int[] mobileNumbers = new int[116];

        mobileNumbers[0] = 166187245;
        mobileNumbers[16] = 966187245;
        mobileNumbers[24] = 566187245;
        mobileNumbers[38] = 566187246;
        mobileNumbers[94] = 566187247;

        for (int i = 0; i<mobileNumbers.length; i++) {
            System.out.println("The element at index :"+i+" is "+mobileNumbers[i]);
        }

        String[] names = new String[3];
        names[2] = "Raj";
        for (int i = 0; i<names.length; i++) {
            System.out.println("The element at index :"+i+" is "+names[i]);
        }

    }

}
