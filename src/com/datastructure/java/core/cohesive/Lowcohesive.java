package com.datastructure.java.core.cohesive;

public class Lowcohesive {
    String message;
    public Lowcohesive(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public static String twiitterMessage( String  message){
        return "twitter is sending "+message;
    }
    public static String whatsappmesg(String message){
        return "Whatsapp is sending "+message;
    }

    public static void main(String[] args) {
        Lowcohesive lowcohesive=new Lowcohesive("hello i am low cohesive");
        System.out.println(lowcohesive.getMessage());
        System.out.println(twiitterMessage(lowcohesive.message));
    }
}
