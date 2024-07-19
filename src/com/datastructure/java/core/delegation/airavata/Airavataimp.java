package com.datastructure.java.core.delegation.airavata;

import com.datastructure.java.core.delegation.airavata.Airavata;

public class Airavataimp implements Airavata {
    private Airavata airavata;

    public Airavataimp(Airavata airavata) {
        this.airavata = airavata;
    }

    @Override
    public void ticketBooking() {
        airavata.ticketBooking();
    }
}
