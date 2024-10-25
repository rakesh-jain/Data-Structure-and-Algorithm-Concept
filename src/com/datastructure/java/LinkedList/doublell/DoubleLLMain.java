package com.datastructure.java.LinkedList.doublell;

public class DoubleLLMain{
    public static void main(String[] args) {
        DoubleLL list=new DoubleLL();
        list.insertFirst(2);
        list.insertFirst(34);
        list.insertFirst(38);
        list.insertLastFromForward(3);
        list.insertMid(2,4);
        list.insertLastFromBackward(10);




        System.out.println(list.getHead());
        System.out.println(list.getTail());
        list.displayForward();
        System.out.println();
        list.displayBackward();
        System.out.println();
        System.out.println(list.getSize());
    }
}
