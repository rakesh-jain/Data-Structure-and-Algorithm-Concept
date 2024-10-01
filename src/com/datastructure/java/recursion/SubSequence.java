package com.datastructure.java.recursion;

import java.util.*;

public class SubSequence {
    public static void main(String[] args) {
        //System.out.println( subseq("abc",""));
         int[] arr=new int[]{1,2,3};
//        List<List<Integer>> ls=subarr(arr);
//        System.out.println(ls);
       // printsub(0,arr,new ArrayList<>());
        //printsub2(0,arr,new ArrayList<>());
//        List<List<Integer>>ls=printsub4(0,arr,new ArrayList<>());
//        System.out.println(ls);
//       for(List<Integer> mi:ls){
//           for(int i:mi){
//               System.out.println(mi);
//           }
//       }
//        String s = "abc";String t = "ahbgdc";
//        System.out.println(isSubsequence(s,t));
    }
    private static ArrayList<String> subseq(String s,String ans){
        if(s.isEmpty()){
            ArrayList<String> ls=new ArrayList<>();
            ls.add(ans);
            return ls;
        }
        char ch=s.charAt(0);
        ArrayList<String> left=subseq(s.substring(1),ans);
        ArrayList<String> right= subseq(s.substring(1),ans+ch);
        left.addAll(right);
        return left;
    }
    private static List<List<Integer>> subarr(int [] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i:arr){
            int n=outer.size();
            for (int j=0;j<n;j++){
                List<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(i);
                outer.add(internal);
            }
        }
        return outer;
    }
    private static void printsub(int ind,int [] arr,List<Integer>ls){
        if(ind>=arr.length){
            System.out.println(ls);
            return;
        }else{
            ls.add(arr[ind]);
            printsub(ind+1,arr,ls);
            ls.remove(ls.size() -1);
            printsub(ind+1,arr,ls);
        }
    }
    private static List<List<Integer>> printsub4(int index,int [] arr,List<Integer>current){
        List<List<Integer>> result = new ArrayList<>();
        // Base case: if the index reaches the length of the array
        if (index == arr.length) {
            result.add(new ArrayList<>(current)); // Add the current subsequence to the result
            return result;
        }
        // Recursive case 1: Exclude the current element and move to the next
        result.addAll(printsub4( index + 1,arr, current));

        // Recursive case 2: Include the current element and move to the next
        current.add(arr[index]);
        result.addAll(printsub4(index + 1,arr, current));

        // Backtrack to remove the current element (undo inclusion)
        current.remove(current.size() - 1);

        return result;
    }
    public static  boolean isSubsequence(String s, String t) {
        if(s.isEmpty() && t.isEmpty()){
            return true;
        }
        if(t.isEmpty()){
            return false;
        }
        char sch=s.charAt(0);
        System.out.println(sch);
        char tch=t.charAt(0);
        System.out.println(tch);
        if(sch==tch){
            return isSubsequence(s.substring(1),t.substring(1));
        }else{
            return isSubsequence(s,t.substring(1));
        }
    }
    public static int appendCharacters(String s, String t) {
        if(s.isEmpty() ||t.isEmpty()){
            return t.length();
        }
        char sch=s.charAt(0);
        char tch=t.charAt(0);

        if(sch==tch){
            return appendCharacters(s.substring(1),t.substring(1));
        }
        else{
            return appendCharacters(s.substring(1),t);
        }

    }


}
