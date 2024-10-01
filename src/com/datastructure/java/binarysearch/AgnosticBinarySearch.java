package com.datastructure.java.binarysearch;

public class AgnosticBinarySearch {
    public static void main(String[] args) {
        int arr[]={70,60,40,30,20,10};
        int target=60;
        System.out.println(orderAgnosticBinarySearch(arr,target));
    }
    public static int orderAgnosticBinarySearch(int arr[],int target){
        int start=0;
        int end= arr.length-1;
        boolean issort=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(issort){
                if(target<arr[mid]){
                    end=mid-1;
                } else if (target>arr[mid]) {
                    start=mid+1;
                }else {
                    return mid;
                }
            }else{
                if(target>arr[mid]){
                    end=mid-1;
                } else if (target<arr[mid]) {
                    start=mid+1;
                }else {
                    return mid;
                }
            }
        }
        return 0;
    }
}
