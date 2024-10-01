package com.datastructure.java.recursion;

public class Cyclicsort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        sort(arr,0);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    private static void sort(int arr[],int start){
        if(start>arr.length-1){
            return ;
        }
        int correct=arr[start]-1;
        if(arr[start]!=arr[correct]){
            swap(arr,start,correct);
        }
        sort(arr, start+1);
    }
    private static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
