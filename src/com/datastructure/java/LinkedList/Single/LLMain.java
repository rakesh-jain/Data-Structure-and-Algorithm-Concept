package com.datastructure.java.LinkedList.Single;


public class LLMain {
    public static void main(String[] args) {
        LL single=new LL();
        single.insertFirst(1);
       single.insertmid(2,2);
        single.insertLast(10);
        single.display();
        System.out.println(single.getHead());
        System.out.println(single.getTail());
        System.out.println(single.getHeadNext());

       // System.out.println(single.size);
        //System.out.println(single);
    }
}
