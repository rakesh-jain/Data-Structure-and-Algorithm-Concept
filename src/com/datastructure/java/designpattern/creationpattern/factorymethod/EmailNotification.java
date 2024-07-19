package com.datastructure.java.designpattern.creationpattern.factorymethod;

public class EmailNotification implements Notification{
    @Override
    public void notifyuser() {
        System.out.println("Email Notified ");
    }
}
