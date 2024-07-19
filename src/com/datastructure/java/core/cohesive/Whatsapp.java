package com.datastructure.java.core.cohesive;

public class Whatsapp extends SendMessage{
    public Whatsapp(String message) {
        super(message);
    }

    @Override
    void processmessage() {
        System.out.println("whatsapp is sending message"+message);
    }
}
