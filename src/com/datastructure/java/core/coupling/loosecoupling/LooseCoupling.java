package com.datastructure.java.core.coupling.loosecoupling;

public class LooseCoupling {
    public static void main(String[] args) {
     Student student=new Student("Rakesh jain");
     student.setCompitation(new Sing());
     student.displayTalentCompitation();
     student.setCompitation(new Dance());
     student.displayTalentCompitation();

    }
}
