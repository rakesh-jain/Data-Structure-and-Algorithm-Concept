package com.datastructure.java.dependency;

interface MessageService{
    void sendMessage(String send,String rec);
}
class Emailservices implements MessageService{


    @Override
    public void sendMessage(String send, String rec) {
        System.out.println(send+" "+rec);
    }
}
class SMSServices implements MessageService{


    @Override
    public void sendMessage(String send, String rec) {
        System.out.println(send+" "+rec);
    }
}
interface Consumer{
    void processMessage(String send, String rec);
}
class ApplicationMessageProcessor implements Consumer{
     private final MessageService messageService;

     public ApplicationMessageProcessor(MessageService messageService){
         this.messageService=messageService;
     }


    @Override
    public void processMessage(String send, String rec) {
        messageService.sendMessage(send,rec);
    }
}

interface Injector{
    public Consumer getConsume();
}
class SMSinjector implements Injector{
    @Override
    public Consumer getConsume() {
        return new ApplicationMessageProcessor(new SMSServices());
    }
}
class Emailinjector implements Injector{

    @Override
    public Consumer getConsume() {
        return new ApplicationMessageProcessor(new Emailservices());
    }
}

public class MessageMain {
    public static void main(String[] args) {
        Injector injector=new SMSinjector();
        Consumer consumer= injector.getConsume();
        consumer.processMessage("rakesh","ganesh");

        Injector injector1=new Emailinjector();
        Consumer consumer1=injector1.getConsume();
        consumer1.processMessage("Rakesh","venky");
    }
}
