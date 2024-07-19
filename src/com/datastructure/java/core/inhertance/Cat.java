package com.datastructure.java.core.inhertance;

public class Cat extends Animal{
    private String colour;

    public Cat(boolean isVeg, String food, short legs) {
        super(isVeg, food, legs);
        this.colour="grey";
    }

    public Cat(boolean isVeg, String food, short legs, String colour) {
        super(isVeg, food, legs);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
