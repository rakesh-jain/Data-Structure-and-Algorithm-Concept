package com.datastructure.java.core.cohesive;

public class Twitter extends SendMessage {

    public Twitter(String message) {
     super(message);
    }

    @Override
    void processmessage() {
        System.out.println("twitter is sending"+message);
    }
}
