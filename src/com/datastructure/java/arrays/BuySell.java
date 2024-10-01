package com.datastructure.java.arrays;

public class BuySell {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
     int min=Integer.MAX_VALUE;
     int temp=0;
     int profit=0;
     for(int i=0;i<prices.length;i++){
         if(prices[i]<min){
             min=prices[i];
         }

         if(prices[i]>min){
             temp=prices[i]-min;
             if(profit<temp){
                 profit=temp;
             }
         }
     }
     return profit;
    }
}
