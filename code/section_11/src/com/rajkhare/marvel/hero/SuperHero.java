package com.rajkhare.marvel.hero;

public interface SuperHero {

    String userPower();

    /**
     * If Y received kill the villain
     * If N received stop the villain
     * @param c indicated Y or N
     * @return - Returns status
     */
    String stopVillain(char c);

}
