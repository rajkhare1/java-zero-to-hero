package com.rajkhare.marvel.hero.impl;

import com.rajkhare.marvel.hero.A;
import com.rajkhare.marvel.hero.AB;

public class C implements  AB,A {

    @Override
    public void m1() {

    }

    @Override
    public void m2() {
        AB.super.m2();
    }
}
