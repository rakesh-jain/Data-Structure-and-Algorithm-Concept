package com.datastructure.java.core.abstractexample;

public class OwnEarner extends Employee{
    private double kg;
    private int kgPeramount;


    @Override
    public double calculateSalary() {
        return  getKgPeramount()*getKg();
    }

    public OwnEarner(int id, String name) {
        super(id, name);
    }

    public OwnEarner(int id, String name, double kg, int kgPeramount) {
        super(id, name);
        this.kg = kg;
        this.kgPeramount = kgPeramount;
        workers_count++;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public int getKgPeramount() {
        return kgPeramount;
    }

    public void setKgPeramount(int kgPeramount) {
        this.kgPeramount = kgPeramount;
    }
}
