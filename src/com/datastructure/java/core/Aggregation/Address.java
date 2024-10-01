package com.datastructure.java.core.Aggregation;

public class Address {
    @Override
    public String toString() {
        return "Address{" +
                "no=" + no +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    private int no;
    public String street;
    public String city;
    public String state;
    public String country;

    public Address(int no, String street, String city, String state, String country) {
        this.no = no;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
