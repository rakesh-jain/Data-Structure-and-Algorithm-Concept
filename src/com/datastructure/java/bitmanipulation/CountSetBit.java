package com.datastructure.java.bitmanipulation;

public class CountSetBit {
    public static void main(String[] args) {
        int number=10;
        System.out.println(countSetBit(number));
        System.out.println(countSetBit1(number));
        System.out.println(countSetBit2(number));
    }
    public static int countSetBit(int num){
        int count=0;
        while(num!=0){
            count++;
            num-=num&(-num);
        }
        return count;
    }
    public static int countSetBit1(int num){
        int count=0;
        while(num!=0){
            count++;
            num=num&(num-1);
        }
        return  count;
    }
    public static int countSetBit2(int num){
        int count=0;
        while(num>0){
            if((num&1)==1){
                count++;
            }
            num=num>>1;
        }
        return count;
    }
}
