package com.datastructure.java.core.coupling;

public class House {
    int no_Bedroom;

    BedRoom bed=new BedRoom("grey","coastal","good looking");
    public House(int no_Bedroom) {
        this.no_Bedroom = no_Bedroom;
    }
    public void displayinfo(){
        System.out.println("number of Bedroom "+no_Bedroom);
        System.out.println(bed.toString());
    }

    public static void main(String[] args) {
        //tight coupling
        House house=new House(1);
        house.displayinfo();
    }

}
