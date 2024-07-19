package com.datastructure.java.core.overriding;

public class Vehicle {
    private int breakscount;
    private int gear;
    private int speed;

    public int getBreakscount() {
        return breakscount;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public Vehicle(int breaks, int gear, int speed) {
        this.breakscount = breaks;
        this.gear = gear;
        this.speed = speed;
    }
    public void pedalOnBreaks(){
        if(speed<0){
            System.out.println("off");
            return;
        }else{
            breakscount++;
            speed-=5;
        }

    }
    public void speedUp(){
        if(speed>250){
            System.out.println("exceed");
            return;
        }else{
            speed+=10;
        }

    }
    public void speedDown(){
        if(speed<1){
            System.out.println("slow");
            return;
        }else{
            speed-=5;
        }
    }
    public void pedalOngear(){
        if(gear<=4){
            gear+=1;
        }else{
            System.out.println("no gear");
        }
    }
}
