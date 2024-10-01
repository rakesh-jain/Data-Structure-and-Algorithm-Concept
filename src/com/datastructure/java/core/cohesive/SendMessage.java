package com.datastructure.java.core.cohesive;

public abstract  class SendMessage {
    String message;

    public SendMessage(String message) {
        this.message = message;
    }

    abstract void processmessage();

}
