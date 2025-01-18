package com.rajkhare.marvel.hero.app;

import com.rajkhare.marvel.hero.SuperHero;
import com.rajkhare.marvel.hero.impl.CaptainAmerica;
import com.rajkhare.marvel.hero.impl.Developer;
import com.rajkhare.marvel.hero.impl.IronMan;
import com.rajkhare.marvel.hero.impl.SpiderMan;

public class MarvelHeroDemo {

    public static void main(String[] args) {

        System.out.println(SuperHero.UNIVERSE_NAME);

        SuperHero ironMan = new IronMan();
        invokeSuperHero(ironMan, 'Y');

        SuperHero spiderMan = new SpiderMan();
        invokeSuperHero(spiderMan, 'N');

        SuperHero captainAmerica = new CaptainAmerica();
        invokeSuperHero(captainAmerica, 'N');

        Developer developer = new Developer();
        developer.walk();
    }

    private static void invokeSuperHero(SuperHero superHero, char c) {
        System.out.println(superHero.userPower());
        System.out.println(superHero.stopVillain(c));
    }

}
