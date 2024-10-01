package com.datastructure.java.recursion;


import java.util.*;
import java.util.ArrayList;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> outer=new ArrayList<>();
        nextPermutation(arr,outer);
        System.out.println(outer);
    }
    public static  void nextPermutation(int[] nums,List<List<Integer>> outer) {
     helper(0,outer,nums);
    }
    private static void helper(int ind, List<List<Integer>> outer, int [] arr){
        if(ind>arr.length-1){
            List<Integer> inner=new ArrayList<>();
            for(int j:arr){
                inner.add(j);
            }
            outer.add(new ArrayList<>(inner));
            return ;
        }
        for(int i=ind;i<arr.length;i++){
            if(i!=ind && arr[i]==arr[i-1])continue;
            swap(ind,i,arr);
            helper(ind+1,outer,arr);
            swap(i,ind,arr);
        }
    }
    static void swap(int i,int j, int nums[]){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
