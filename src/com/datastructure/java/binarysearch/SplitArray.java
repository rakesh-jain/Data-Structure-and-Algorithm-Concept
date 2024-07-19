package com.datastructure.java.binarysearch;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 8, 10};
        System.out.println( splitArray(arr,2));
    }
            public static int splitArray(int[] nums, int k) {
                int s=0;
                int e=0;

                for(int num: nums){
                    s= Math.max(s,num);
                    e+=num;
                }

                while(s<e){
                    int mid= s+(e-s)/2;
                    // int sum=0;
                    // int pieces=1;
                    int pieces= find(1,nums,0,mid);

                    if(pieces<=k){
                        e=mid;
                    }
                    else{
                        s=mid+1;
                    }
                }
                return s;
            }
            static int find(int pieces,int[] nums,int sum,int mid){
                for(int num: nums){
                    if(num+sum>mid){
                        sum=num;
                        pieces++;
                    }
                    else{
                        sum+=num;
                    }
                }
                return pieces;
    }
}
