package com.datastructure.java.LinkedList.CircularLL;

public class CircularLL {
    Node head;
    Node tail;
    int size;

    public int getHead() {
        return head.data;
    }

    public int getTail() {
        return tail.data;
    }

    public int getSize() {
        return size;
    }

    CircularLL(){
        size=0;
    }
    public void insertLast(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
            size++;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
        size++;
    }
    public void insertFirst(int val){
        Node node =new Node(val);
        node.next=head;
        tail.next=node;
        head=node;

    }
    public void delete(int val){
        Node node=head;
        if(node==null){
            return;
        }
        if(node.data==val){
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node fast=node.next;
            if(fast.data==val){
                    node.next = fast.next;
                    if(fast==tail){
                        tail=node;
                    }
                    break;
            }
            node=node.next;
        }while(node!=head);
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
