package com.datastructure.java.LinkedList.CircularLL;

public class CircularLL {
    Node head;
    Node tail;
    int size;

    CircularLL(){
        size=0;
    }
    public void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }

    public void display(){
        Node node=head;
        if(node!=null){
            do{
                System.out.print(node.data+"->");
                node=node.next;
            }while (node!=head);
        }
    }
    private class Node{
        private int data;
        private Node next;

        Node(int data){
            this.data=data;
        }

        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
}
