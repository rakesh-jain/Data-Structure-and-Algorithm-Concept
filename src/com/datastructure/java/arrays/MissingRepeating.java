package com.datastructure.java.arrays;


import java.util.ArrayList;
import java.util.*;

public class MissingRepeating {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(4,3,6,5,1,1));
       // ArrayList<Integer> ans=repeatedNumber(list);
        //System.out.println(ans);
        System.out.println(repeatedNumber1(list));
    }
    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        int i=0;
        ArrayList<Integer>list=new ArrayList<>();
        int correct=0;
        while(i<A.size()){
            correct=A.get(i)-1;
            if(A.get(i)!=A.get(correct)){
                int temp=A.get(i);
                A.set(i,A.get(correct));
                A.set(correct,temp);
            } else if (i+1<A.size() && i+1!=A.get(i) && A.get(i)==A.get(correct)) {
                System.out.println(i+1);
                System.out.println(A.get(i));
                list.add(i+1);
                list.add(A.get(i));
                i++;
            }else{
                i++;
            }
        }
        return list;
    }
    public static List<Long> repeatedNumber1(final List<Integer> A) {
        int n=A.size();
        long s=0;
        long sn= ((long) n *(n+1))/2;
        long s2=0;
        long sn2=(long)(n*(n+1)*(2L *n+1))/6;
        for (Integer integer : A) {
            s += integer;
            s2 += ((long) integer * integer);
        }
        long  val1=s-sn;
        long val2=s2-sn2;
        val2=val2/val1;
        long x=0;
        if(val1<0){
          x =(val2+val1)/2;
        }else{
             x=(val2-val1)/2;
        }
        long y=0;
        if(val2<0){
            y=val2+x;
        }else{
            y=val2-x;
        }
        return new ArrayList<>(Arrays.asList(x, y));
    }
}
