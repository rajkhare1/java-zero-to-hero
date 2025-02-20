package com.rajkhare.object.demo;

import java.util.Arrays;
import java.util.logging.Logger;

public class VarDemo {

    private static Logger logger = Logger.getLogger(VarDemo.class.getName());

    public static void main(String[] args) {
        var message = "Hello World !";
        var person = new Person();
        var arr = new ArrayIndexOutOfBoundsException();

        String[] people = new String[] {"RICHA","RAJ","SIA"};
        logger.info(Arrays.toString(people));
        //copy of array
        String[] newPeople = Arrays.copyOf(people,4);
        logger.info(Arrays.toString(newPeople));
        newPeople[3] = "SITA";
        logger.info(Arrays.toString(newPeople));

    }

}
