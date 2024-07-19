package com.datastructure.java.string;

public class Reversemid {
    public static void main(String[] args) {
        System.out.println( reversePrefix("xyxzxe",'z'));
        System.out.println();
    }
    public static String reversePrefix(String word, char ch) {

        StringBuilder rev=new StringBuilder();
        int i=0;int index=0;
        while(i<word.length()){
            if(ch==word.charAt(i)){
                rev.append(word.charAt(i));
                index++;
                i=word.length()-1;
            }else{
                rev.append(word.charAt(i));
                index++;
            }
            i++;
        }
        rev=rev.reverse();
        rev.append(word.substring(index,word.length()));
        return rev.toString();
    }
}
