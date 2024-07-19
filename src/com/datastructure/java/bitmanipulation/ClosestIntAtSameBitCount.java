package com.datastructure.java.bitmanipulation;

public class ClosestIntAtSameBitCount {
    private static final int Num_Unsigned_Bits=63;

    public static void main(String[] args) {
        System.out.println(closestIntSameBitCount(7));
    }
    public static long closestIntSameBitCount(long num) {
        for(int i=0;i<Num_Unsigned_Bits-1;++i){
            if(((num>>>i)&1)!=((num>>>(i+1))&1)){
                num^=(1L<<i)|(1L<<(i+1));
                return num;
            }
        }
        throw new IllegalArgumentException("All bits are ® or 1");
    }

}
