package com.datastructure.java.core.delegation;

public class Rajahamsa implements BusTicketBooking{
    @Override
    public void ticketBooking() {
        System.out.println("Rajahamsa bus ticket is booked");
    }
}
