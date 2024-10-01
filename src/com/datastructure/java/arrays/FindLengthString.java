package com.datastructure.java.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class FindLengthString {
    public static void main(String[] args) {
      //  System.out.println(lengthOfString("abcabcd"));
       // System.out.println(lengthOfString1("jkashdfhhasjkhfjhasdhasdfasdfasdfasdfwerhgdfghxzVcvnfdrtyurtywer"));
      //  System.out.println(pows(2,4));
        System.out.println(Math.pow(2147483647,2)%1337);
        System.out.println(superPow(2147483647,new int[]{2,0,0}));

    }
    private static double pows(int x,int n){
        double ans=1;
        while(n>0){
            if((n&1)==0){
                x=(x*x);
                n=n/2;
            }else{
                ans=ans*x;
                n=n-1;
            }
        }
        return ans;
    }
    private static int lengthOfString(String s){
        char []ch=s.toCharArray();
        String ans="";
        for(int i=0;i<s.length();i++){
            char c=ch[i];
            if(c!=0) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (c == ch[j]) {
                        ch[j] = 0;
                    }
                }
                ans += c;
            }
        }
        return ans.length();
    }
    private static int lengthOfString1(String s){
        char []ch=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        char c=0;
        int count=0;
        while(start<=end && start<s.length()){
            c=ch[start];
            if(c==0){
                start++;
            } else if (ch[end]==0) {
                end--;
            } else if(c!=ch[end]){
                        end--;
            } else if(c==ch[end] && start==end){
                        count++;
                        start++;
                        end=s.length()-1;
            } else if(c==ch[end]) {
                        ch[end] = 0;
                        end--;
            }
        }
        return count;
    }
    private static int lengthOfNonRepeatingCharacters(String s) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        // First, count the occurrences of each character
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Count characters that occur exactly once
        int count = 0;
        for (int occurrences : charCountMap.values()) {
            if (occurrences == 1) {
                count++;
            }
        }
        return count;
    }
    public static int superPow(int x, int[] b) {
        int n= repalced(b);
        x=x%1337;
        int ans=1;
        while(n>0){
            if((n&1)==1){
                ans=(ans*x)&1337;
            }
                x=(x*x)%1337;
                n=n/2;
        }
        return ans;
    }
    private static int repalced(int []b){
        int ans=0;
        for(int i=0;i<b.length;i++){
            ans=(ans*10+b[i])%1140;
        }
        return ans;
    }
}
