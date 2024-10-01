package com.datastructure.java.core.delegation;

public class FlyBus  implements BusTicketBooking{
    @Override
    public void ticketBooking() {
        System.out.println(" Fly bus ticket Booked ");
    }
}
