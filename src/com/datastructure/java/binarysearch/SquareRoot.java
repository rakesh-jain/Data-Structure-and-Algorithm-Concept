package com.datastructure.java.binarysearch;

public class SquareRoot {
    public static void main(String[] args) {
        int number=144;
        System.out.println(sqrt(number));
    }
    public static int sqrt(int n){
        int start=0;
        int end=n;
        int mid=0;
        while(start<=end){
             mid=start+(end-start)/2;
            if(mid<=n/mid){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return end;
    }
}
