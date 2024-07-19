package com.datastructure.java.bitmanipulation;

public class ParityOfNumber {
    //Parity of number : Parity of Binary word is 1 if the number of 1's is odd otherwise 0 .....
    public static void main(String[] args) {
        int number=13;
       // System.out.println(parity1(number));
      //  System.out.println(parity2(number));
        System.out.println(parity3(number));
        System.out.println(parity(number));
    }
    public static short parity1(int num){
        short result=0;
        while(num!=0){
            result^=1;
            num&=num-1;
        }
        return result;
    }
    //fastest way to find the parity
    public  static int  parity2(int num){
        int  count=0;
        while(num!=0){
            count++;
            num-=num&(-num);
        }
        return count&1;
    }
    public static int parity3(int num){
        int result=0;
        while(num!=0){
            result^=num&1;
            num>>=1;
        }
        return result&1;
    }
    public static short parity(long n){
        n^=n>>32;
        n^=n>>16;
        n^=n>>8;
        n^=n>>4;
        n^=n>>2;
        n^=n>>1;
      return (short)(n & 0x1);

    }

}
