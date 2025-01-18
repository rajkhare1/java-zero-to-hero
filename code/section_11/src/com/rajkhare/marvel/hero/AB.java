package com.rajkhare.marvel.hero;

public interface AB extends A,B{

    @Override
    void m1();

    @Override
    default void m2() {

    }
}
