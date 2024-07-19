package com.datastructure.java.core.delegation;

import com.datastructure.java.core.delegation.airavata.AiravatBliss;
import com.datastructure.java.core.delegation.airavata.Airavata;
import com.datastructure.java.core.delegation.airavata.Airavataimp;

public class BusMain {
    public static void main(String[] args) {
        BusTicketBookingimp busTicketBookingimp=new BusTicketBookingimp(new FlyBus());
        busTicketBookingimp.ticketBooking();
        busTicketBookingimp=new BusTicketBookingimp(new Airavataimp(new AiravatBliss()) );
        busTicketBookingimp.ticketBooking();
    }
}
