package com.rajkhare.marvel.app;

import com.rajkhare.marvel.base.Person;
import com.rajkhare.marvel.heros.IronMan;

public class DynamicPoly {

    public static void main(String[] args) {
        Person person = new IronMan();// upcasting
        person.walk();// Ironman walk method is going to be invoked
        person.eat("Ice Cream");

        IronMan ironMan = new IronMan();
        ironMan.callOverriddenEatMethod();
    }

}
