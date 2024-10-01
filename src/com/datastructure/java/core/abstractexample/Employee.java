package com.datastructure.java.core.abstractexample;

public abstract class Employee {
    public static int workers_count=0;
    private int id;
    private String name;


    public abstract double calculateSalary();



    public Employee(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public static int getWorkers_count() {
        return workers_count;
    }

//    public static void setWorkers_count(int workers_count) {
//        Employee.workers_count = workers_count;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
