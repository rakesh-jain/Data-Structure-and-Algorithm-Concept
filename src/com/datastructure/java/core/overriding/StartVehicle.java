package com.datastructure.java.core.overriding;

public class StartVehicle {
    public static void main(String[] args) {
        //Vehicle vehicle=new Vehicle(0,1,0);
        //Bike bike=new Bike(0,0,0,"white",2017);
        Vehicle vehicle;
        vehicle=new Bike(0,1,5,"black",2017);//upcasting
        System.out.println("___________________Bike Ride_________________________");
        System.out.println( vehicle.toString());
        vehicle.speedUp();
        vehicle.speedUp();
        vehicle.speedDown();
        vehicle.pedalOngear();
        vehicle.speedUp();
        vehicle.pedalOngear();
        vehicle.speedUp();
        vehicle.pedalOnBreaks();
        vehicle.speedDown();
        vehicle.pedalOnBreaks();
        vehicle.speedDown();

        System.out.println("---------------------------------------Car Ride------------------------------------------------");

        vehicle=new Car(0,1,10,2001,"Maruthi suzuki alto 800");
        System.out.println(vehicle.toString());
        vehicle.speedUp();
        vehicle.speedUp();
        vehicle.speedDown();
        vehicle.pedalOngear();
        vehicle.speedUp();
        vehicle.pedalOngear();
        vehicle.speedUp();
        vehicle.pedalOnBreaks();
        vehicle.speedDown();
        vehicle.pedalOnBreaks();
        vehicle.speedDown();




    }
}
