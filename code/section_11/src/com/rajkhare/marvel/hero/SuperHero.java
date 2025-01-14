package com.rajkhare.marvel.hero;

import com.rajkhare.marvel.hero.impl.Person;

public interface SuperHero extends Person {

    String userPower();

    /**
     * If Y received kill the villain
     * If N received stop the villain
     * @param c indicated Y or N
     * @return - Returns status
     */
    String stopVillain(char c);

}
