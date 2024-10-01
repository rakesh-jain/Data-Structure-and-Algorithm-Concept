package com.datastructure.java.arrays;

import java.util.Arrays;

public class MergeTwoArray {

    public static void main(String[] args) {
       int[] nums1 = {4,5,7};
       int  m = 3;
       int []nums2 = {1,2,3,5,6};
      // mergetwo(nums1, nums1.length,nums2,nums2.length);
      //  System.out.println(Arrays.toString(nums1));
//       int  n = 3;
//       merge(nums1,m,nums2,n);
//        System.out.println(Arrays.toString(nums1));
//        System.out.println(Arrays.toString(nums2));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
     int i=m-1;
     int j=0;
     while(i>=0 && j<n){
         if(nums1[i]>nums2[j]){
             int temp=nums1[i];
             nums1[i]=nums2[j];
             nums2[j]=temp;
             i--;
             j++;
         }else {
             break;
         }
     }
     bubbleSort(nums1);
     bubbleSort(nums2);
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
    public static void mergetwo(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length==0){
            nums1=nums2;
        }else{
            int len=m+n;
            int gap=len/2+(len%2);
            while(gap>0){
                int start=0;
                int end=start+gap;
                while(end<len){
                    //arr1 to arr2 swap
                    if(start<m && end>=n){
                        swapifGreater(nums1, nums2,start,end-m);
                    }//arr2 to arr2
                    else if(start>=n){
                        swapifGreater(nums1, nums2,start-m,end-m);
                    }//arr1 to arr1
                    else{
                        swapifGreater(nums1, nums2,start,end);
                    }
                    start++;end++;
                }
                if(gap==1)break;
                gap=gap/2+(gap%2);
            }
            System.out.println(Arrays.toString(nums1));
            System.out.println(Arrays.toString(nums2));
            merget(nums1,nums2,m,n);
        }
    }
    public static void swapifGreater(int []nums1, int [] nums2,int start,int end){
        if(nums1[start]>nums2[end]){
            int temp=nums1[start] ;
            nums1[start]=nums2[end];
            nums2[end]=temp;
        }
    }
    public static void merget(int [] num1,int []num2,int m,int n){
        for(int i=0;i<n;i++){
            num1[m+i]=num2[i];
        }
    }

}
