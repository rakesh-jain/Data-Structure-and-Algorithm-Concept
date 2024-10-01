package com.datastructure.java.recursion;

import org.w3c.dom.ls.LSOutput;

public class SkipCharacterRecursion {
    public static void main(String[] args) {
        skip1("baccad");
        System.out.println(skipApple("bdapplefg",""));
    }
    private static String skipApple(String q,String ans){
        if(q.isEmpty()){
            return ans;
        }
        if(q.startsWith("apple")){
            return skipApple(q.substring("apple".length()),ans);
        }else{
            ans=ans+q.charAt(0);
            return skipApple(q.substring(1),ans);
        }
    }
    private static String skip(String s){
        String ans="";
        return skipHelper(s,ans,0);
    }
    private static String skipHelper(String quest,String ans,int ind){
        if(ind>=quest.length()){
            return ans;
        }if(quest.charAt(ind)!='a'){
            ans=ans+quest.charAt(ind);
        }
        return skipHelper(quest,ans,ind+1);
    }
    private static void skip1(String s){
        String ans="";
        System.out.println(skip1helper(s,ans));
    }
    private static String skip1helper(String q,String ans){
        if(q.isEmpty()){
            //System.out.println(ans);
            return ans;
        }
        char ch=q.charAt(0);
        if (ch != 'a') {
            ans = ans + ch;
             skip1helper(q.substring(1), ans);
        }
        return skip1helper(q.substring(1),ans);
    }
}
