package com.rajkhare.marvel.hero.impl;

import com.rajkhare.marvel.hero.SuperHero;

public class CaptainAmerica implements SuperHero {
    @Override
    public String userPower() {
        return "CaptainAmerica is using his power";
    }

    /**
     * If Y received kill the villain
     * If N received stop the villain
     *
     * @param c indicated Y or N
     * @return - Returns status
     */
    @Override
    public String stopVillain(char c) {
        if (c == 'Y')
            return "CaptainAmerica killed the Villain";
        else
        return "CaptainAmerica stopped the Villain";
    }
}
