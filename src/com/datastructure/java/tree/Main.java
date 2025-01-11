package com.datastructure.java.tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BinaryTree b1=new BinaryTree();
        b1.populate(scanner);
        b1.displayTree();
    }
}
