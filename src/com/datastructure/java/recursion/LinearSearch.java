package com.datastructure.java.recursion;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{10,20,30,40,50},30,0));
    }
    static int search(int arr[],int target, int n){
        if(n==arr.length){
            return -1;
        }
        if(arr[n]==target){
            return n;
        }
        return search(arr,target,n+1);
    }

}
