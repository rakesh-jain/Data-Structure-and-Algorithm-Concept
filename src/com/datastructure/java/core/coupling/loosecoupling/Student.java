package com.datastructure.java.core.coupling.loosecoupling;

public class Student {
    String name;
    private Compitation compitation;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Compitation getCompitation() {
        return compitation;
    }

    public void setCompitation(Compitation compitation) {
        this.compitation = compitation;
    }
     public void displayTalentCompitation(){
         System.out.println( " hi i am "+name);
         System.out.println(compitation.talent());
     }
}
