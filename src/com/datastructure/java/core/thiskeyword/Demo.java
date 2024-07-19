package com.datastructure.java.core.thiskeyword;

public class Demo {
    int rollno;
    String name;
    int count;
    Demo(){
        this.rollno=rollno;
        this.name=name;
        System.out.println("name");//two times it calls
    }
    Demo(int count){
        this();
        this.count=count;
    }

    public static void main(String[] args) {
        Demo d =new Demo(),d1=new Demo(9);
        System.out.println(d1.count);
    }

}
