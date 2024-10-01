package com.datastructure.java.designpattern.creationpattern.factorymethod;

import java.sql.SQLOutput;

public class PushNotification implements Notification{
    @Override
    public void notifyuser() {
        System.out.println("Push notified");
    }
}
