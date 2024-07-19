package com.datastructure.java.core.abstractexample;

import static com.datastructure.java.core.abstractexample.Employee.workers_count;

public class Factory {
    public static void main(String[] args) {
        Employee employee=new OwnEarner(101,"Rakesh",78,10);
        System.out.println(employee.calculateSalary());
        employee=new Dailyworkers(102,"Ganesh",8,80);
        System.out.println(employee.calculateSalary());
        employee=new Dailyworkers(102,"Ganesh",8,80);
        System.out.println(employee.calculateSalary());
        System.out.println(workers_count);

    }
}
