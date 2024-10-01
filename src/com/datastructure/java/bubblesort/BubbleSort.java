package com.datastructure.java.bubblesort;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={4,5,6,3,2,1};
        bubbleSort(arr);
        for(int n:arr){
            System.out.print(n+",");
        }
    }
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length;i++){
            for(int j=1;j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
    private static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
