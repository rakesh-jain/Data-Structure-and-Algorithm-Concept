package com.datastructure.java.LinkedList.CircularLL;

public class CircularLLMain{
    public static void main(String[] args) {
        CircularLL list=new CircularLL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertFirst(4);

        list.delete(3);
        list.display();
        System.out.println();
        System.out.println(list.getTail());
        System.out.println(list.getHead());

    }
}
