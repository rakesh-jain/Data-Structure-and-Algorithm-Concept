package com.datastructure.java.core.overriding;

public class Car extends Vehicle{
     private int model;
     private String name;

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void pedalOnBreaks() {
        super.pedalOnBreaks();
        System.out.println("breakscount :"+getBreakscount());
    }

    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("speed :"+getSpeed());
    }

    @Override
    public void speedDown() {
        super.speedDown();
        System.out.println("speed :"+getSpeed());
    }

    @Override
    public void pedalOngear() {
        super.pedalOngear();
        System.out.println("gear :"+getGear());
    }

    public Car(int breaks, int gear, int speed, int model, String name) {
        super(breaks, gear, speed);
        this.model = model;
        this.name = name;
    }

    public Car(int breaks, int gear, int speed) {
        super(breaks, gear, speed);
    }
}
