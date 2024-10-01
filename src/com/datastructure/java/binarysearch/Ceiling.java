package com.datastructure.java.binarysearch;

public class Ceiling {
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        System.out.println(sqrt(8));
        //System.out.println(arr[ceiling(arr,15)]);
    }
    public static int ceiling(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
    static double sqrt(int a){

     double ans=Math.pow(10,Math.log10(a)/2);
        return ans;
    }

}
