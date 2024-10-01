package com.datastructure.java.binarysearch;

public class Pivot {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,1,2,3,4};
        System.out.println(pivot(arr));
    }
    public static int pivot(int arr[]){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]<arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
