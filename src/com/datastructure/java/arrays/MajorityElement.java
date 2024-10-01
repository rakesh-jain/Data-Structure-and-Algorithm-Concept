package com.datastructure.java.arrays;


import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,1,1,2,2,3,3,3,3,3,3}));
    }
    public static int majorityElement(int[] nums) {
        int count=0;
     int max=0;
     int element=0;
     for(int i=0;i< nums.length;i++){
          count=0;
         for(int j=i;j<nums.length;j++){
             if(nums[i]==nums[j]){
                 count++;
             }
         }
         if(max<count){
             max=count;
             element=nums[i];
         }
     }
     return element;
    }
    public static int majority(int [] nums){
        Map<Integer,Integer> mpp=  new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = mpp.getOrDefault(nums[i], 0);
            mpp.put(nums[i], value + 1);
        }

        //searching for the majority element:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (nums.length / 2)) {
                return it.getKey();
            }
        }
        return -1;
    }
    public static List<Integer> majorityList(int [] nums){
        Map<Integer,Integer> mpp=  new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = mpp.getOrDefault(nums[i], 0);
            mpp.put(nums[i], value + 1);
        }

        //searching for the majority element:
        List<Integer> list=new ArrayList<>();
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (nums.length / 3)) {
                 list.add(it.getKey());
            }
        }
        return list;
    }

    public int majority2(int nums[]){
        int ele=0;
        int count=0;
        for(int i:nums){
            if(count==0){
                ele=i;
                count=1;
            }else if (ele==i) count++;
            else count--;
        }
        int count1=0;
        for(int i:nums){
            if(ele==i) count1++;

        }
        return (count1>nums.length/2)?ele:-1;
    }
}
