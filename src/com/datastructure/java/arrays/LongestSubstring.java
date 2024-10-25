package com.datastructure.java.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring1("abcaabcdbba"));
    }

    public static  int lengthOfLongestSubstring(String s) {
    int max=0;
    if(s.length()==0){
        return 0;
    }
    for(int i=0;i<s.length();i++){
        Set<Character> set=new HashSet<>();
        for(int j=i;j<s.length();j++){
            if(set.contains(s.charAt(j))){
                max=Math.max(max,j-i);
                break;
            }
            set.add(s.charAt(j));
        }
    }
    return max;
    }
    public static  int lengthOfLongestSubstring1(String s) {
        int left = 0, right = 0;
        int n = s.length();
        int len = 0;
        HashMap < Character, Integer > mpp = new HashMap < Character, Integer > ();
        while (right < n) {
            if (mpp.containsKey(s.charAt(right))) {
                left = Math.max(mpp.get(s.charAt(right)) + 1, left);
            }
            mpp.put(s.charAt(right), right);

            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
}
