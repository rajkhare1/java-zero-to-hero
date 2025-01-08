package com.rajkhare.marvel.app;

import com.rajkhare.marvel.animals.Cat;
import com.rajkhare.marvel.animals.Dog;
import com.rajkhare.marvel.base.Animal;

public class DownCastingDemo {

    public static void main(String[] args) {
        Animal anm;
        Dog dog = new Dog();
        anm = dog;// upcasting

        dog = (Dog) anm;// downcasting
        AnimalUtility.performAction(dog);

        Cat cat1 = new Cat();
        AnimalUtility.performAction(cat1);

        if (anm instanceof Cat) {
        Cat cat = (Cat) anm;// ClassCastException
        }
    }

}
