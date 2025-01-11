package com.datastructure.java.arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArray {
    public static void main(String[] args) {
        System.out.println(maxLen(new int[]{1,2,3,1,1,1,1}));
        System.out.println(maxLen1(new int[]{1,2,3,1,1,1,1}));
    }
   static  int maxLen(int arr[])
    {
        int n= arr.length;
     Map<Long,Integer> map=new HashMap<>();
     long sum=0;
     int maxlength=0;
     for(int i=0;i<n;i++) {
         sum += arr[i];
         if (sum == 3) {
             maxlength = i + 1;
         }else{
         int val = (int) (sum - 3);
         if (map.get(val) != null) {
             maxlength = Math.max(maxlength, i - map.get(val));
         } else {
             map.put(sum, i);
         }
     }
     }
     return maxlength;
    }
   static int maxLen1(int A[])
    {
        int n=A.length;
        // Your code here
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();
        int maxi = 0;
        int sum = 0;
        for(int i = 0;i<n;i++) {
            sum += A[i];
            if(sum == 3) {
                maxi = i + 1;
            }
            else {
                if(mpp.get(sum) != null) {
                    maxi = Math.max(maxi, i - mpp.get(sum));
                }
                else {
                    mpp.put(sum, i);
                }
            }
        }
        return maxi;
    }
}
