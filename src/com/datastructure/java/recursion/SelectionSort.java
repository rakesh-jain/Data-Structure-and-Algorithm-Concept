package com.datastructure.java.recursion;

public class SelectionSort{
    public static void main(String[] args) {
        int arr[]={2,4,5,1,8,0};
        sort(arr,0);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public  static void sort(int arr[],int start){
        if(start>=arr.length){
            return;
        }
        int last= arr.length-1-start;
        int maxIndex =getMaxIndex(arr,0,last,0);
        swap(arr,maxIndex,last);
        sort(arr,start+1);
    }
    public static int getMaxIndex(int arr[],int start,int end,int max){
        if(start>end){
            return max;
        }
        if(arr[max]<=arr[start]){
            max=start;
        }
        return getMaxIndex(arr, start+1, end,max);
    }
    public static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

}
