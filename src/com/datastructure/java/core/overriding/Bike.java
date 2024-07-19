package com.datastructure.java.core.overriding;

public class Bike extends Vehicle{
    private String colour;
    private int model;


    public Bike(int breaks, int gear, int speed, String colour, int model) {
        super(breaks, gear, speed);
        this.colour = colour;
        this.model = model;
    }

    public Bike(int breaks, int gear, int speed) {
        super(breaks, gear, speed);
    }

    @Override
    public void pedalOnBreaks() {
        super.pedalOnBreaks();
        System.out.println("breakcounts :"+getBreakscount());
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

    @Override
    public String toString() {
        return "Bike{" +
                "colour='" + colour + '\'' +
                ", model=" + model + '\''+
                '}';
    }

}
