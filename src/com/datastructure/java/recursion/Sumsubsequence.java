package com.datastructure.java.recursion;

import java.util.ArrayList;
import java.util.List;

public class Sumsubsequence {
    public static void main(String[] args) {
        System.out.println(sumseq(0,new ArrayList<>(),2,0,new int[]{1,2,1}));
    }
    private static List<List<Integer>> sumseq(int ind, List<Integer> ls, int sum, int count,int arr[]){
        List<List<Integer>> outer=new ArrayList<>();
        if(ind>arr.length-1){
            if(sum==count){
               // System.out.println("new arraylist"+ls);
                outer.add(new ArrayList<>(ls));
                return outer;
            }
            return outer;
        }
        ls.add(arr[ind]);
        count+=arr[ind];
        outer.addAll(sumseq(ind+1,ls,sum,count,arr));
//        System.out.println("adding"+ls);
        ls.remove(ls.size()-1);
        count-=arr[ind];
        outer.addAll(sumseq(ind+1,ls,sum,count,arr));
//        System.out.println("remove"+ls);
        return outer;
    }
}
