package com.datastructure.java.selectionsort;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={2,3,4,1,5};
        selectionSort(arr);
        for(int n:arr){
            System.out.print(n+".");
        }

    }
    private static void selectionSort(int arr[]){
        for(int i=0;i< arr.length;i++){
            int last=arr.length-1-i;
            int maxindex=getmaxindex(arr, last);
            swap(arr,last,maxindex);
        }
    }
    private static int  getmaxindex(int[] arr,int end){
        int max= 0;
        for(int i = 0; i<=end; i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    private static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
