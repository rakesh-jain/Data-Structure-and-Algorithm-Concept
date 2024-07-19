package com.datastructure.java.core.Aggregation;

import java.util.List;

public class StudentDetails {
    private int rollno;
    String name;
    String email;
    Address address;


    public StudentDetails(int rollno, String name, Address address, String email) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
        this.email = email;
    }



    public String display(StudentDetails obj){

       return  "StudentDetails { " +
                "rollno=" + obj.rollno +
                ", name='" +obj.name + '\n' +
                ", email='" + obj.email + '\n' +
                ", address=" + obj.address.toString() +
                '}' ;
  }


    public static void main(String[] args) {
        Address address1=new Address(121,"someshwara","bangalore","Karnataka","India");
        StudentDetails studentDetails=new StudentDetails(101,"Rakesh",address1,"rakeshrjain02@gmail.com");
        System.out.println(studentDetails.display(studentDetails));

    }
}
