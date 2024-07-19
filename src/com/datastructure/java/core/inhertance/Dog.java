package com.datastructure.java.core.inhertance;

public class Dog extends Animal{
    String trust;
    public Dog(boolean isVeg, String food, short legs) {
        super(isVeg, food, legs);
    }

    public Dog(boolean isVeg, String food, short legs, String trust) {
        super(isVeg, food, legs);
        this.trust = trust;
    }

    public String getTrust() {
        return trust;
    }

    public void setTrust(String trust) {
        this.trust = trust;
    }
}
