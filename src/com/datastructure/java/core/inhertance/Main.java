package com.datastructure.java.core.inhertance;

public class Main {
    public static void main(String[] args) {
        Cat c=new Cat(true,"fish", (short) 4);
        System.out.println(c.getIsVeg()+" "+c.getColour());
        Dog d=new Dog(true,"pedigree",(short)4,"100%");
        System.out.println(d.trust+" "+d.getFood());
        //upcasting
        Animal a=c;
        System.out.println("Upcasting"+a.getFood());

        Cat cat=(Cat)a;
        System.out.println("downcasting"+((Cat) a).getColour());

    }

}
