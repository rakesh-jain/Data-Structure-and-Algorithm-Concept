package com.datastructure.java.LinkedList.doublell;

public class DoubleLL {
    private Node head;
    private Node tail;
    private int size;
    DoubleLL(){
        size=0;
    }

    public int getHead() {
        return head.data;
    }

    public int getTail() {
        return tail.data;
    }

    public int getSize() {
        return size;
    }

    private class Node{
        private Node next;
        private Node prev;
        private int data;

        Node(int data){
            this.data=data;
        }
        Node(int data,Node next, Node prev){
            this.data=data;
            this.next=next;
            this.prev=prev;
        }
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        if(head!=null){
            head.prev=node;
        }
        if(tail==null){
            tail=head;
        }
        head=node;
        size++;
    }
    public void insertLastFromForward(int val){
        Node node=new Node(val);
        Node tempprev=head;
        while(tempprev.next!=null){
            tempprev=tempprev.next;
        }
        tempprev.next=node;
        node.prev=tempprev;
        tail=node;
        size++;
    }
    public void insertLastFromBackward(int val){
        Node node=new Node(val);
        tail.next=node;
        if(tail!=null){
            node.prev=tail;
        }
        tail=node;
    }
    public void insertMid(int index,int val){
        Node indexNode=get(index-1);
        Node node=new Node(val);
        node.next=indexNode.next;
        indexNode.next=node;
        node.prev=indexNode;
        if(node.next!=null){
            node.next.prev=node;
        }
    }

    public Node get(int val){
        Node node=head;
        for(int i=1;i<val;i++){
            node=node.next;
        }
        return node;
    }

    public void displayForward(){
        Node node=head;
        while(node!=null){
            System.out.print(node.data+"->");
            node=node.next;
        }
    }
    public void displayBackward(){
        Node tailnode=tail;
        while(tailnode!=null){
            System.out.print(tailnode.data+"->");
            tailnode=tailnode.prev;
        }
    }
}
