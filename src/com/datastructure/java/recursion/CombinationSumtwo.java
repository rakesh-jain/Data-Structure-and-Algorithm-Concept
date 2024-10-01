package com.datastructure.java.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumtwo {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2};
        System.out.println(combinationSum2(arr,4));
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> outer=new ArrayList<>();
        helper(0,target,candidates,new ArrayList<>(),outer);
        return outer;
    }
    public static void helper(int ind, int target, int [] arr, List<Integer>inner, List<List<Integer>> outer){
        if(target==0){
            outer.add(new ArrayList<>(inner));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;

            inner.add(arr[i]);
            helper(i+1,target-arr[i],arr,inner,outer);
            inner.remove(inner.size()-1);
        }
    }
}
