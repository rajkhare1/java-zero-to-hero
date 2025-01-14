package com.rajkhare.marvel.hero.impl;

import com.rajkhare.marvel.hero.SuperHero;

public class SpiderMan implements SuperHero {
    @Override
    public String userPower() {
        return "SpiderMan is using his power";
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
            return "SpiderMan killed the Villain";
        else
        return "SpiderMan stopped the Villain";
    }
}
