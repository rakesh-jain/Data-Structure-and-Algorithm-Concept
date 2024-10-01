package com.datastructure.java.binarysearch;

public class MaxGetChar {
    public static void main(String[] args) {
        char ch[]={'c','f','j'};
        System.out.println(maxgetchar(ch,'f'));
    }
    private static int maxgetchar(char letter[], char target){
        int start=0;
        int end= letter.length-1;
        while(start<=end){
           int mid=start+(end-start)/2;
           if(target<letter[mid]){
               end=mid-1;
           }else if(target>letter[mid]){
               start=mid+1;
           }//optional case if i is equal to that character
           else{
               return mid;
           }
        }
        return start % (letter.length);
    }

}
