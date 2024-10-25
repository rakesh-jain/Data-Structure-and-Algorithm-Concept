package com.datastructure.java.arrays;

import java.util.*;

public class Consecutive {
    public static void main(String[] args) {
        System.out.println(longestConsecutive1(new int[]{0,0,-1}));
        System.out.println(cons(new int[]{0,0,-1}));
        System.out.println(longestSuccessiveElements(new int[]{0,0,-1}));
    }
    public static  int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>(Arrays.stream(nums).boxed().toList());
        int count=0;
        Iterator data= set.iterator();
        while(data.hasNext()){
            int val= (int) data.next();
            if (set.contains(val+1)){
                count++;
            }
        }
        return count+1;
    }
    public static  int longestConsecutive1(int[] nums) {
        if (nums.length==1){
            return 1;
        }else if(nums.length<=0){
            return 0;
        }
        int ele=0;
        int count=1;
        for(int i=0;i<nums.length;i++){
            ele=nums[i];
            for(int j=0;j< nums.length;j++){
                if(nums[i]==(nums[j]+1)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
   private static int cons(int []nums){
        Arrays.sort(nums);
        int n= nums.length;
        int longest=1;
        int count=0;
        int last_smaller=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]-1==last_smaller){
                count+=1;
                last_smaller=nums[i];
            } else if (nums[i] != last_smaller) {
                count=1;
                last_smaller=nums[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
   }
    public static int longestSuccessiveElements(int[] nums) {

//        Set<Integer> set = new HashSet<>();
//
//        // put all the array elements into set
//        for (int i = 0; i < n; i++) {
//            set.add(a[i]);
//        }
        int n = nums.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set=new HashSet<>(Arrays.stream(nums).boxed().toList());

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}
