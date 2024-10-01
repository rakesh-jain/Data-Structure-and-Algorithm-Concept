package com.datastructure.java.quicksort;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int [] arr=new int[]{8,3,4,12,5,6};
        mergesort(arr,0,arr.length);
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void mergesort(int arr[], int  start, int end){
        if((end-start)==1){
            return;
        }
        int mid=start+(end-start)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid,end);

        merger(arr,start,mid,end);
    }
    private static void merger(int arr[],int start, int mid ,int end){
        int mix[] =new int[end-start];
        int i=start;
        int j=mid;
        int k=0;
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];j++;
            }
            k++;
        }
        while(i<mid){
            mix[k]=arr[i];
            i++;k++;
        }

        while(j<end){
            mix[k]=arr[j];
            j++;k++;
        }
        //System.arraycopy(mix,0,arr,start+0,mix.length);
        for(int l=0;l< mix.length;l++){
            arr[start+l]=mix[l];
        }
    }
}
