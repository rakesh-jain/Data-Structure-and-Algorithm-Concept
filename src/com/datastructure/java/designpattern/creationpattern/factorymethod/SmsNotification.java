package com.datastructure.java.designpattern.creationpattern.factorymethod;

public class SmsNotification implements Notification {
    @Override
    public void notifyuser() {
        System.out.println("SMS notified");
    }
}
