package com.datastructure.java.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class FourSum {
    public static void main(String[] args) {
        System.out.println(fourSum4(new int[]{2,2,2,2,2},8));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<Integer> inner=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        long sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    for(int l=k+1;l<nums.length;l++){
                        sum+=nums[i]+nums[j];
                        sum+=nums[k]+nums[l];
                        if(sum==target){
                            Integer []va=new Integer[]{nums[i],nums[j],nums[k],nums[l]};
                            Arrays.sort(va);
                            inner=List.of(va);
                            if(!ans.contains(inner)){
                                ans.add(inner);
                            }
                        }
                        sum=0;
                    }
                }
            }
        }
        return ans;
    }
    public static List<List<Integer>> fourSum1(int[] nums, int target) {
        List<Integer> inner=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        int val=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    for(int l=k+1;l<nums.length;l++){
                        val=target-(nums[i]+nums[j]+nums[k]);
                        if(val==nums[l]){
                            Integer []va=new Integer[]{nums[i],nums[j],nums[k],nums[l]};
                            Arrays.sort(va);
                            inner=List.of(va);
                            if(!ans.contains(inner)){
                                ans.add(inner);
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
    public static List<List<Integer>> fourSum2(int[] nums, int target) {
      Set<List<Integer>>ls=new HashSet<>();
      for(int i=0;i<nums.length;i++){
          for(int j=i+1;j<nums.length;j++){
              Set<Long> set=new HashSet<>();
              for(int k=j+1;k<nums.length;k++){
                  long sum=nums[i]+nums[j]+nums[k];
                  long fourth=target-sum;
                  if(set.contains(fourth)){
                      List<Integer> temp=new ArrayList<>();
                      temp.add(nums[i]);
                      temp.add(nums[j]);
                      temp.add(nums[k]);
                      temp.add((int)fourth);
                      temp.sort(Integer::compareTo);
                      ls.add(temp);
                  }
                  set.add((long)nums[k]);
              }
          }
      }
      List<List<Integer>> ans=new ArrayList<>(ls);
      return ans;
    }
    public static List<List<Integer>> fourSum3(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans =new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
         if(i>0 && nums[i]==nums[i-1]) continue;
         for(int j=i+1;j<n;j++){
             if(j>i+1 && nums[j]==nums[j-1]) continue;
             int k=j+1;
             int l=n-1;
             while(k<l){
                 long sum=nums[i]+nums[j]+nums[k]+nums[l];
                 if(target==sum){
                     List<Integer> ls=new ArrayList<>();
                     ls.add(nums[i]);
                     ls.add(nums[j]);
                     ls.add(nums[k]);
                     ls.add(nums[l]);
                     ans.add(ls);
                     k++;l--;
                     while(k<l && nums[k]==nums[k-1]) k++;
                     while(k<l && nums[l]==nums[l+1]) l--;
                 }else if(sum<target){
                     k++;
                 }else{
                     l--;
                 }
             }
         }
     }
        return ans;
    }
    public static List<List<Integer>> fourSum4(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            for(int l=i+1;l<nums.length;l++){
                if (l>i+1 && nums[l] == nums[l-1]) {
                     continue;
                 }
                int j = l + 1;
                int k = nums.length - 1;

                while (j < k) {
                    int total = nums[i] + nums[j] +nums[l]+ nums[k];
                    if(total==target){
                        res.add(Arrays.asList(nums[i], nums[j],nums[l], nums[k]));
                        j++;

                        while (nums[j] == nums[j-1] && j < k) {
                            j++;
                        }
                        while(nums[k]==nums[k-1] && j<k){
                            k--;
                        }
                    }else if (total > 0) {
                        k--;
                    } else if (total < 0) {
                        j++;
                    }
                }
            }
        }
        return res;
    }
}

