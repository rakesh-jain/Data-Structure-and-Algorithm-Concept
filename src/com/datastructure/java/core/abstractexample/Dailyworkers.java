package com.datastructure.java.core.abstractexample;

public class Dailyworkers extends Employee{
    private int paymentPerHour;
    private int payment;

    public Dailyworkers(int id, String name, int paymentPerHour, int payment) {
        super(id, name);
        this.paymentPerHour = paymentPerHour;
        this.payment = payment;
        workers_count++;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }


    public int getPayment() {
        return payment;
    }


    public void setPayment(int payment) {
        this.payment = payment;
    }

    @Override
    public double calculateSalary() {
        return getPayment()*getPaymentPerHour();
    }

    public Dailyworkers(int id, String name) {
        super(id, name);
    }
}
