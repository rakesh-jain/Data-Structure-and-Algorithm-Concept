package com.datastructure.java.core.inhertance;

public class Animal {
    private boolean isVeg;
    private String food;
    private short legs;

    public Animal(boolean isVeg, String food, short legs) {
        this.isVeg = isVeg;
        this.food = food;
        this.legs = legs;
    }

    public boolean getIsVeg() {
        return isVeg;
    }

    public void setIsVeg(boolean isVeg) {
        this.isVeg = isVeg;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public short getLegs() {
        return legs;
    }

    public void setLegs(short legs) {
        this.legs = legs;
    }
}
