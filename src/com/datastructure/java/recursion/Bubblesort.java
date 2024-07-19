package com.datastructure.java.recursion;

public class Bubblesort {
    public static void main(String[] args) {
        int arr[]={4,5,3,2,1,0};
        sort(arr,0);
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void sort(int arr[],int start){
        if(start>=arr.length){
            return;
        }
        sorthelp(arr,start,1);
        sort(arr,start+1);
    }
    static void sorthelp(int arr[],int start,int j){
        if(j>=arr.length-start){
            return;
        }
        if(arr[j]<arr[j-1]){
            swap(arr,j,j-1);
        }

        sorthelp(arr,start,j+1);
    }
    public static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
