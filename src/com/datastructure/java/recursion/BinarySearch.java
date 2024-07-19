package com.datastructure.java.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarysearch(new int[]{10,20,30,40,50,60},60,0,5));
    }
    public static int binarysearch(int arr[],int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target>arr[start]){
            return binarysearch(arr,target,mid+1,end);
        }
        return binarysearch(arr,target,start,mid-1);
    }
}
