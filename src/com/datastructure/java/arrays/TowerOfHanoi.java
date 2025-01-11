package com.datastructure.java.arrays;

import java.io.*;

public class TowerOfHanoi {

    public static void moves(int n, boolean left) {
        if (n == 0) return;
        moves(n-1, !left);
        if (left) System.out.println(n + " left");
        else System.out.println(n + " right");
        moves(n-1, !left);
    }
    public static void main(String[] args) throws IOException {
        System.out.println("start");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(reader.readLine());
        moves(n,true);
    }
}
