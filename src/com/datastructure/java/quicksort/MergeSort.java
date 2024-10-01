package com.datastructure.java.quicksort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr=new int[]{8,3,4,12,5,6};
        int []mat=mergesort(arr);
        for(int i:mat){
            System.out.println(i);
        }
    }
    private static int[] mergesort(int arr[]){
        if(arr.length==1){
            return arr;
        }
        int mid= arr.length/2;
        int[] left=mergesort(Arrays.copyOfRange(arr,0,mid));
        int []right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    private static int[] merge(int left[],int []right){
        int []mix=new int[left.length + right.length];
        int i=0,j=0,k=0;
        while(i< left.length && j< right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while(i< left.length){
            mix[k]=left[i];
            i++;k++;
        }
        while(j< right.length){
            mix[k]=right[j];
            j++;k++;
        }
        return mix;
    }
}
