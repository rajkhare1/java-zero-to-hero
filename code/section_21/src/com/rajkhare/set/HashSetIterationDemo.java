package com.rajkhare.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

public class HashSetIterationDemo {

    private static Logger logger = Logger.getLogger(HashSetIterationDemo.class.getName());

    public static void main(String[] args) {
        Set<String> superpowers = new HashSet<>();
        // Superheros and their unique abilities
        superpowers.add("Invisibility");
        superpowers.add("Teleportation");
        superpowers.add("Mind Reading");
        superpowers.add("Super Strength");
        superpowers.add("Time Travel");

        // Villains and their mischievous power
        superpowers.add("Laser Vision");
        superpowers.add("Weather Manipulation");
        superpowers.add("Telekinesis");
        superpowers.add("Shape-Shifting");
        superpowers.add("Chaos Induction");

        for (String superpower : superpowers) {
            logger.info(superpower.toUpperCase());
        }

        Iterator<String> iterator = superpowers.iterator();
        while (iterator.hasNext()) {
            logger.info(iterator.next().toLowerCase());
        }
    }

}
