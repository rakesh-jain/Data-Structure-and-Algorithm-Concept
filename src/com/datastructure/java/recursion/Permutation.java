package com.datastructure.java.recursion;

import java.util.*;
import java.util.stream.Collectors;

public class Permutation {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int arr1[]={0,1,0,0,9};
        System.out.println(permuteUnique(arr1));
       // System.out.println(permutation(arr));
    }
    public static List<List<Integer>> permutation(int[] nums){
        List<List<Integer>> outer=new ArrayList<>();
        //helper(nums,new ArrayList<>(),new boolean[nums.length],outer);
        helper2(0,nums,outer);
        return outer;
    }
    private static void helper(int []nums, List<Integer> ds, boolean[] freq,List<List<Integer>> outer){
        if(ds.size()== nums.length){
            outer.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i< nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i] );
                helper(nums, ds, freq, outer);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
   private static void helper2(int ind,int []nums,List<List<Integer>> outer){
        if(ind>=nums.length){
            outer.add(new ArrayList<>(Arrays.stream(nums).boxed().collect(Collectors.toList())));
            return;
        }
        for(int i=ind;i<nums.length;i++){
            swap(ind,i,nums);
            helper2(ind+1, nums,outer);
            swap(i,ind,nums);
        }
    }
    static void swap(int i,int j, int nums[]){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> outer=new ArrayList<>();
        helper3(0,nums,outer);
        //outer.sort(Comparator.comparing(list -> list.get(0)));
        return outer;
    }
    private static void helper3(int ind,int []nums,List<List<Integer>> outer){
        if(ind>=nums.length){
            if(outer.contains(Arrays.stream(nums).boxed().collect(Collectors.toList()))){
                return;
            }
            outer.add(new ArrayList<>(Arrays.stream(nums).boxed().collect(Collectors.toList())));
            return;
        }
        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i]==nums[i-1]) continue;
            swap(ind,i,nums);
            helper3(ind+1, nums,outer);
            swap(i,ind,nums);
        }
    }
}

