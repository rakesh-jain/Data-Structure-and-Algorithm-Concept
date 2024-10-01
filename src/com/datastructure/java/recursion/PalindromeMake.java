package com.datastructure.java.recursion;



public class PalindromeMake {

    public static void main(String[] args) {
       String s = "aacecaaa";
        String ans=shortestPalindrome(s);
        System.out.println(ans);
    }
    public static String shortestPalindrome(String s) {
        String ans="";
        String anss =helper2(s,ans,0,s.length()-1);
        //String rev=reverse(anss.substring(0,anss.length()-1));
        return anss;
    }
    public static String helper2(String s, String ans, int start, int end){
        if(start>end){
            return ans+s.substring(start,s.length());
        }
        char schar=s.charAt(start);
        char echar=s.charAt(end);
        if(schar==echar){
            return helper2(s,ans+schar,start+1,end-1);
        }else{
            return helper2(s,ans+echar,start,end-1);
        }
    }
    private static String reverse(String s){
        int end=s.length()-1;
        String ans="";
        while(end>=0){
            char c=s.charAt(end);
           ans=ans+c;
           end--;
        }
        return ans;
    }
    private static String helper(String s,String ans,int start,int end){
        if(start>end){
            return ans;
        }
        char schar=s.charAt(start);
        char echar=s.charAt(end);
        if(schar==echar){
            return helper(s,ans+schar,start+1,end-1);
        }else {
            return helper(s,ans+echar,start,end-1);
        }
    }
}
