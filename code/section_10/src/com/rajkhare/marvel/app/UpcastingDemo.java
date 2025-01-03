package com.rajkhare.marvel.app;

import com.rajkhare.marvel.animals.Cat;
import com.rajkhare.marvel.animals.Dog;
import com.rajkhare.marvel.base.Animal;

public class UpcastingDemo {

    public static void main(String[] args) {
        Animal anm = new Animal();
        anm.setName("Scooby");
        AnimalUtility.printName(anm);

        anm = new Dog();
        anm.setName("Carlie");
        AnimalUtility.printName(anm);

        Cat cat = new Cat();
        cat.setName("Snoopy");
        AnimalUtility.printName(cat);
    }



}
