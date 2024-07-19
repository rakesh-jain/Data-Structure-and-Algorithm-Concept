package com.datastructure.java.core.inhertance;

public class InheritanceDatamember1 extends Inheritancedatamember{
    public InheritanceDatamember1(int a, int b) {
        super(a, b);
    }
    public void change(){
        super.a=10;
        super.b=20;
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        Inheritancedatamember inheritancedatamember=new Inheritancedatamember(40,50);
        InheritanceDatamember1 inheritanceDatamember1=new InheritanceDatamember1(inheritancedatamember.a, inheritancedatamember.b);
        inheritanceDatamember1.change();
        System.out.println(inheritancedatamember.toString());
    }
}
