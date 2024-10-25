package com.datastructure.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArraySumK {
    public static void main(String[] args) {
        System.out.println(maxLen(new int[]{1,2,3,1,1,1,1,3,3},9));
        System.out.println(solve(new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9)),6));
    }
    static int maxLen(int arr[], int n)
    {
        int sum=arr[0];
        int p1=0;
        int p2=0;
        int max=0;
        while(p2<n){
            p2++;
            if(p2<n) sum+=arr[p2];
            while(sum>6){
                sum-=arr[p1];
                p1++;
            }
            if(sum==6){
                max=Math.max(max,p2-p1+1);
            }

        }
        return max;
    }
    public static int solve(ArrayList<Integer> A, int B) {
        int max=0;
        for(int i=0;i<A.size();i++){
            for (int j=i;j<A.size();j++) {
                int xor=0;
                for (int k = i; k<=j; k++) {
                    xor^=A.get(k);
                }
                if(xor==B){
                    max++;
                }
            }
        }
        return max;
    }
}
