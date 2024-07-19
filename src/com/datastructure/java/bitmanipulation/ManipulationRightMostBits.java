package com.datastructure.java.bitmanipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManipulationRightMostBits {
    public static void main(String[] args) {
        int n=10;
//        System.out.println(right_1_bit_off(n));
//        System.out.println(rightmost_0_bit_on(n));
//        System.out.println(rightmost_trailing_1s_off(n));
//        System.out.println(rightmost_turn_on_0s(n));

               List<Integer> arr= targetIndices(new int[]{1,2,2,3,5},2);
        System.out.println(arr);
    }
    public static String right_1_bit_off(int n){
        //   3(011)
        // & 2(010)
        //   2(010)
        return Integer.toBinaryString(n&(n-1));
    }
    public static String rightmost_0_bit_on(int n){
        //    10   (1010)
        // or 11   (1011)
        return Integer.toBinaryString(n|(n+1));
    }
    public static String rightmost_trailing_1s_off(int n){
        //     5    0101
        // &   6    0110
        //          0100
        return Integer.toBinaryString(n&(n+1));
    }
    public static String rightmost_turn_on_0s(int n){
        //    3     0011
        // or 2     0010
        //          0011
        return Integer.toBinaryString(n|(n-1));
    }
    public static List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> list=new ArrayList<>();
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                list.add(mid+1);
                if(nums[mid+1]!=target){
                    end=mid-1;
                }else if(nums[mid-1]!=target){
                    start=mid+1;
                }
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return list;
    }


}
