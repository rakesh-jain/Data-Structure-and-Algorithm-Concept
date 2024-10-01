package com.datastructure.java.string;

public class Reversemid {
    public static void main(String[] args) {
        //System.out.println( reversePrefix("xyxzxe",'z'));
        System.out.println(linearSearchOptimization(new int[]{1,6,7,8,9,10,12,14,15,19,21},25));
    }
    static  int linearSearchOptimization(int arr[],int key){
        for(int i=0;i<arr.length; i++){

            if(arr[i]<key){
                i=i+1;
            }else if(arr[i]!=key){
                i=i-1;
            }
            if(arr[i]==key){
                return i;
            }

        }
        return 0;
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
