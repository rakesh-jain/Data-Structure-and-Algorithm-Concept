package com.datastructure.java.recursion;

public class Sortedornot {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,5,7,8};
        System.out.println(sortedornot(arr,0));
    }
    public static boolean sortedornot(int arr[],int start){
        if(start>=arr.length-1){
            return true;
        }
//        if(arr[start]>arr[start+1]){
//            return true;
//        }
        return (arr[start]<arr[start+1]) && sortedornot(arr,start+1);
    }
}
