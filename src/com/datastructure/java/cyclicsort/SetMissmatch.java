package com.datastructure.java.cyclicsort;

public class SetMissmatch {
    public static void main(String[] args) {
     int arr[]={3,4,-1,1};
        firstMissingPositive(arr);
    }
    public static  int firstMissingPositive(int[] nums){
        // List<Integer>list=new ArrayList<Integer>();
        // for(int i=0;i<nums.length;i++){
        //     list.add(nums[i]);
        // }
        // for(int j=1;j<=nums.length;j++){
        //    if(!list.contains(j)){
        //     return j;
        //    }
        // }
        // return nums.length+1;
        sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
    static void sort(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int arr[],int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
