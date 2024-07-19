package com.datastructure.java.core.cohesive;

public class CohesiveMain {
    public static void main(String[] args) {
        HighCohesive highCohesive=new HighCohesive(" hello i am Cohesive");
        SendMessage sendMessage=new Twitter(highCohesive.getMessage()) ;
        sendMessage.processmessage();
        sendMessage=new Whatsapp(highCohesive.getMessage());
        sendMessage.processmessage();

    }
}
