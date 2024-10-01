package com.datastructure.java.recursion;

import java.nio.CharBuffer;

public class Atoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
    }

    public static int myAtoi(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        return helper(0, s, true);
    }

    private static int helper(int ans, String ques, boolean sign) {
        if (ques.isEmpty()) {
            if (!sign) {
                ans = ans * -1;
                return ans;
            }
            return ans;
        }
        char ch = ques.charAt(0);
        if (ch == '-') {
            sign = false;
        } else if (ch == ' ') {
            helper(ans, ques.substring(1), sign);
        } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            return helper(ans, "", sign);
        } else if (ch == '0') {
            helper(ans, ques.substring(1), sign);
        } else if (Integer.parseInt(String.valueOf(ch)) >= 1 && Integer.parseInt(String.valueOf(ch)) <= 9) {
            ans = ans * 10 + Integer.parseInt(String.valueOf(ch));
        }
        return helper(ans, ques.substring(1), sign);
    }
}
