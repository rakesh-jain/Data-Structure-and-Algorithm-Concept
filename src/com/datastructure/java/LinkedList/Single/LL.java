package com.datastructure.java.LinkedList.Single;

import java.util.Arrays;
import java.util.Stack;

public class LL {
    private Node head;
    private Node tail;
    public int size;

    public int getHead() {
        return head.val;
    }
    public int getHeadNext() {
        return head.next.val;
    }

    public int getTail() {
        return tail.val;
    }

    public int getSize() {
        return size;
    }

    public LL() {
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insertmid(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index>=size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    public int deleteFirst(){
        int val= head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val= tail.val;
        tail=secondLast;
        return val;
    }
    public void display(){
        Node node=head;
        System.out.print("{");
        while(node!=null){
            System.out.print(node.val+"->");
            node=node.next;
        }
        System.out.print("}");
    }

    public  Node reverse(){
        Node prev=null;
        Node next;
        Node curr=head;
        while(curr!=null){
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
        }
        Node temp=prev;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        return prev;
    }
    public void reverseStack(){
        Stack<Node>stack=new Stack<>();
        Node node=head;
        while(node!=null){
            stack.push(node);
            node=node.next;
        }
        head=stack.pop();
        node=head;
        while(!stack.isEmpty()){
            node.next=stack.pop();
            node=node.next;
        }
        node.next=null;
    }
    public void fastSize(){
        Node fast=head;
        int i=0;
        while(fast!=null){
            fast=fast.next;
            i=i+1;
        }
        System.out.println(i-2);
    }

    private class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val=val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
//    public LL mergeTwoLists(Node list1, Node list2) {
//
//    }
}
