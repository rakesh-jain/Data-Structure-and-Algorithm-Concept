package com.datastructure.java.dependency;

public class CarMain {
    public static void main(String[] args) {
        //dependency
        CarDao carDao=new CarDao();
        EmailService emailService=new EmailService();
        MotorService motorService=new MotorService();
        CarService carService=new CarService(carDao,emailService,motorService);
        CarService carService1 = carService;
        carService1.getmotorservice();
        carService1.getemailservice();
    }
}
class CarDao{

}
class EmailService{
    public void service(){
        System.out.println("email sent successfully");
    }
}
class MotorService{
     void service(){
        System.out.println("motorservice");
    }
}
class CarService{
   private final CarDao carDao;
   private final EmailService emailService;
   private final MotorService motorService;

    public CarService(CarDao carDao, EmailService emailService, MotorService motorService) {
        this.carDao = carDao;
        this.emailService = emailService;
        this.motorService = motorService;
    }
    public void getmotorservice(){
        motorService.service();
    }
    public void getemailservice(){
        emailService.service();
    }
    
}