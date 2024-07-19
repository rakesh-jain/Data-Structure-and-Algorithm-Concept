package com.datastructure.java.cyclicsort;

public class CyclickSort{
    private static void sort(int arr[]){
        int i=0;
        while(i< arr.length){
          int correct=arr[i]-1;
          if(arr[i]!=arr[correct]){
              swap(arr,i,correct);
          }else{
              i++;
          }
        }
    }
    private static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    public static void main(String[] args) {
        int arr[]={5,4,3,1,2};
        sort(arr);
        for(int n:arr){
            System.out.print(n+",");
        }
    }
}
