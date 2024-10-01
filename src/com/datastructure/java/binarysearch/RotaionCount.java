package com.datastructure.java.binarysearch;

public class RotaionCount {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7,1,2,3};
        System.out.println(pivot(arr)+1);
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
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

}
