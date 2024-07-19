package com.datastructure.java.collection;

import java.sql.SQLOutput;
import java.util.*;

public class CArrayList {
    public static void main(String[] args) {
        //creating a ArrayList
        /**
         * ArrayList allows duplicate elements
         * maintain insertion order
         * non synchronized
         * allow accessing th element at the particular index
         * compare to linkedList slow
         * best suitable for searching
         */
        ArrayList<String> str=new ArrayList<>(5);
        for(int i=0;i<3;i++){
            str.add(i+"RRR");
        }
        System.out.println(str);
        ArrayList<String> str1=new ArrayList<>(5);
        for(int i=0;i<3;i++){
            str1.add(i+"RRR");
        }
        String[] sr=str1.toArray(new String[str.size()]);
        System.out.println(str1);
        System.out.println(str.contains("1RRR"));
        System.out.println(str.contains(str1));
        System.out.println(Arrays.toString(sr));
        int[]arr=new int[2];
        arr[0]=1;
        arr[1]=2;
        List<int[]> ard=new ArrayList<>();
        ard=Arrays.asList(arr);
        str.forEach(a->{
            System.out.println(a);
        });
        Iterator<String> s=str1.iterator();
        s.forEachRemaining(a->{
            System.out.println(a);
        });
        System.out.println("removeAll removes matched element");
        str.add("3re");
//        str.removeAll(str1);
//        System.out.println(str);
        System.out.println("retain looks for same element ");
        str.retainAll(str1);
        System.out.println(str);
        ArrayList<String> firstList  = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go"));
        System.out.println("First List: "+firstList);

        //unmodifiable list
        List<String> unmodifiable=Collections.unmodifiableList(str);
        System.out.println(unmodifiable);
        unmodifiable.add("RrRRR");
        try{
            unmodifiable.add("RrRRR");
        }catch (Exception e){
            System.out.println("unmodifiable list");
        }

    }

}
