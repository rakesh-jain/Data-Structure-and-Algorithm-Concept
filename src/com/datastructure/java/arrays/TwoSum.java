package com.datastructure.java.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.toString(twosum1(new int[]{2,6,5,8,11},14)));
    }
    public static  int[] twoSum(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            if(target==(nums[start]+nums[end])){
                return new int[]{start,end};
            } else if (target<(nums[start]+nums[end])) {
                end--;
                start++;
            }else{
                start++;
                end--;
            }
        }
        return null;
    }
    static int[] twosum1(int[] nums, int target){
        Map<Integer,Integer> map=new HashMap<>();
        int ans=0;
        int value=0;
        for(int i=0;i< nums.length;i++){
           ans= target-nums[i];
           value=map.getOrDefault(nums[i],0);
           if(map.containsKey(ans)){
               return new int[]{map.get(ans),i};
           }else{
           map.put(nums[i], i);
           }
        }
        return null;
    }
}
