package com.datastructure.java.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(threeSum2(new int[]{-1,0,1,2,-1,-4}));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
     List<List<Integer>> ans=new ArrayList<>();
     for(int i=0;i<n;i++){
         if(i>0 && nums[i]==nums[i-1])continue;
         int j=i+1;
         int k=n-1;
         while(j<k){
             long sum=nums[i]+nums[j]+nums[k];
             if(sum==0){
                 List<Integer> ls =new ArrayList<>();
                 ls.add(nums[i]);
                 ls.add(nums[j]);
                 ls.add(nums[k]);
                 ans.add(ls);
                 j++;k--;
                 while(j<k && nums[j]==nums[j+1]) j++;
                 while(j<k && nums[k]==nums[k-1]) k--;
             } else if (sum<0) {
                 j++;
             }else{
                 k--;
             }
         }
     }
     return ans;
    }
    public static List<List<Integer>> threeSum1(int[] nums){
        List<Integer> l=Arrays.stream(nums).boxed().toList();
        int n=nums.length;
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Long> s=new HashSet<>();
            for(int j=i+1;j<n;j++){
                    long sum=nums[i]+nums[j];
                    long three=0-(int)sum;
                    if(s.contains(three) && l.contains(three) ){
                        List<Integer> ls=new ArrayList<>();
                        ls.add(nums[i]);
                        ls.add(nums[j]);
                        ls.add((int)three);
                        set.add(ls);
                    }
                    s.add(three);
            }
        }
        List<List<Integer>> ans=new ArrayList<>(set);
        return ans;
    }
    public static List<List<Integer>> threeSum2(int[] nums) {
        int n=nums.length;
        Set<List<Integer>> ans=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    long sum=nums[i]+nums[j]+nums[k];
                    if(0==sum){
                        List<Integer> ls=new ArrayList<>();
                        ls.add(nums[i]);
                        ls.add(nums[j]);
                        ls.add(nums[k]);
                        if(!ans.contains(ls)){
                            ans.add(ls);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }

}
