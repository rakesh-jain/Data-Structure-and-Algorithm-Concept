package com.datastructure.java.core.delegation;

public class BusTicketBookingimp implements BusTicketBooking{
    private BusTicketBooking busTicketBooking;

    public BusTicketBookingimp(BusTicketBooking busTicketBooking) {
        this.busTicketBooking = busTicketBooking;
    }

    @Override
    public void ticketBooking() {
        busTicketBooking.ticketBooking();

    }
}
