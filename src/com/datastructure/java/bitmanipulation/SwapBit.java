package com.datastructure.java.bitmanipulation;

public class SwapBit {
    public static void main(String[] args) {
        System.out.println(swapbit(73,1,6));

    }
    public static long swapbit(long num,int i, int j){
        if(((num>>i)&1)!=((num>>j)&1)){
            long bitmask=1L<<i| 1L<<j;
            System.out.println(Integer.toBinaryString((int)num));
            System.out.println(Integer.toBinaryString((int)bitmask));
            num^=bitmask;
        }
        return num;
    }
}
