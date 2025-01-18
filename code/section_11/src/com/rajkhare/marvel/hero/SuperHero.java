package com.rajkhare.marvel.hero;

import com.rajkhare.marvel.hero.impl.Person;

public interface SuperHero extends Hero , Person{

    String UNIVERSE_NAME = "Marvel";

    String userPower();

    /**
     * If Y received kill the villain
     * If N received stop the villain
     * @param c indicated Y or N
     * @return - Returns status
     */
    String stopVillain(char c);

     default String trackLiveLocation() {
         String liveLocation = "USA";
         System.out.println("I am in "+liveLocation);
         return liveLocation;
     }

     static String commonCharacteristics() {
         return "Superhuman abilities, Willingness to sacrifice";
     }

    @Override
    default void walk() {
        Hero.super.walk();
    }
}
