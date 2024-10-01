package com.datastructure.java.arrays;

public class Sortzeros {
    public static void main(String[] args) {
        int [] arr={2,0,2,0,1,1};
        sortit(arr);
       for(int i:arr){
           System.out.println(i);
       }
        System.out.println("----------------");
        System.out.println(loop(69,43));
        System.out.println(factorial(43));
      //  System.out.println(loop(69,43)/factorial(43));
    }
    static long factorial(int n){
        if(n==1 || n==0){
            return 1;
        }

        return n*factorial(n-1);
    }
    static long loop(int n, int r){
        long ans=1;
        for(int i=n;i>n-r;i--){
            ans=ans*i;
        }
        return ans;
    }

    private static void sortit(int[] arr){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(mid<=end){
            if(arr[mid]==0){
                swap(start,mid,arr);
                start++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            }
            else  if(arr[mid]==2){
                swap(mid,end,arr);
                end--;
            }
        }
    }
    private static  void swap(int  start, int end, int[] arr){
        int tem=arr[start];
        arr[start]=arr[end];
        arr[end]=tem;
    }
}
