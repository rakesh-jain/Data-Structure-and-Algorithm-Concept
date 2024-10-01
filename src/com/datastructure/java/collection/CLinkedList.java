package com.datastructure.java.collection;

import java.util.Collections;
import java.util.LinkedList;

public class CLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("Rakesh");
        ll.add("ramesh");
        System.out.println("add at particular index");
        ll.add(1,"Ganesh");
        System.out.println(ll);
        LinkedList<String> ll2=new LinkedList<>();
        ll2.add("venky");
        ll2.add("monkey");
        ll.addAll(ll2);
        System.out.println(ll);
        Collections.reverse(ll);
        System.out.println(ll);
        ll.addFirst("rora0r");
        System.out.println(ll+"addfirst");
        ll.addLast("sdfsdf");
        System.out.println(ll+"addlast");
        System.out.println("get "+ll.get(2));
        System.out.println("getfirst "+ll.getFirst());
        System.out.println("getlast "+ll.getLast());
        System.out.println(ll.peek());
        System.out.println(ll.pop());
        System.out.println(ll.pollFirst());
        System.out.println(ll);
        ll.push("hello");
        System.out.println(ll);

    }
}
