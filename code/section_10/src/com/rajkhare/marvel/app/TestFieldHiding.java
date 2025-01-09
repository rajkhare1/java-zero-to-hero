package com.rajkhare.marvel.app;

import com.rajkhare.marvel.base.Vehicle;
import com.rajkhare.marvel.vehicle.Car;

public class TestFieldHiding {

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.color);
        System.out.println(car.horsePower);
        System.out.println(car.turningRadius);
        System.out.println(car.isAutomatic);

        car.printCarDetails();// super concept testing on fields
        System.out.println(car.superTest);// name is unique in super class then easily accessed in any relation

        Vehicle vehicle = car;// upcasting
        System.out.println(vehicle.color);
        System.out.println(vehicle.horsePower);
        System.out.println(vehicle.turningRadius);

    }

}
