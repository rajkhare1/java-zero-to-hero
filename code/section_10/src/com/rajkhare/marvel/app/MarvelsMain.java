package com.rajkhare.marvel.app;

import com.rajkhare.marvel.base.Person;
import com.rajkhare.marvel.heros.IronMan;

public class MarvelsMain {

    public static void main(String[] args) {
        IronMan ironMan = new IronMan();
        ironMan.walk();
        ironMan.eat("Pasta");
        ironMan.sleep();
        ironMan.userPower();

        Person person = new Person();
        int hc = person.hashCode();
        String str = person.toString();
    }



}
