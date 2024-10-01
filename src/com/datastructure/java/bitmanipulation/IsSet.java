package com.datastructure.java.bitmanipulation;

public class IsSet {
    public static void main(String[] args) {
        int number=10;
        System.out.println(isSet(number,2));

    }
    public static boolean isSet(int number , int x){
        return ((number >> x) & 1) == 1;
    }
}
