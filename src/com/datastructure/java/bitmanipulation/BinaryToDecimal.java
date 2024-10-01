package com.datastructure.java.bitmanipulation;

import java.util.Stack;

public class BinaryToDecimal {
    public static void main(String[] args) {
        // using the integer
        int number=10101;
        int basevalue=2;
        //System.out.println(binaryToDecimalViaInteger(number,basevalue));

        //using the String value
        String num="10101";
        int base=2;
       // System.out.println(binaryToDecimal(num,base));
       // System.out.println(Integer.parseInt(num,base));
        //System.out.println(binaryToOctal("1010101",8));
        //System.out.println(octalToDecimal(12570,8));


        toBinary(17);
        System.out.println();
    }
    public static int binaryToDecimal(String num ,int base){
        int value=0;
        for(int i=0;i<=num.length()-1;i++){
            value+= (int) ((num.charAt((num.length()-1)-i)-'0')*(Math.pow(2,(num.length()-1)-i)));
        }
        return value;
    }
    public static int binaryToDecimalViaInteger(int number,int base){
        int result=0;
        int i=0;
        while(number!=0){
          int rem=number%10;
          result+= (int) (rem*Math.pow(2,i));
          i++;
          number/=10;
        }
        return result;
    }
    public static int binaryToOctal(String num,int base){
        int value=binaryToDecimal(num,2);

        //using  string reverse or using integer reverse
        StringBuilder ans=new StringBuilder();
        int result=0;
        while(value!=0){
            int rem=value%8;
            result=result*10+rem;

            value=value/8;
        }
        ans.append(result);
       return  Integer.parseInt(ans.reverse().toString());
    }
    public static int octalToDecimal(int num,int base){
        int result=0;
        int i=0;
        while(num!=0){
            int rem=num%10;
            result+=rem*(int)Math.pow(8,i);
            i++;
            num/=10;
        }
        return result;
    }
    ///////////////////////////////////
    public static int hexadecinmalToDecimal(String num,int base){
        int result=0;
        int i=0;
        int length=num.length()-1;
        while(length!=0){

        }
        return result;
    }

   public static void toBinary(int N) {
        //Write your code here
        StringBuilder str=new StringBuilder();
        while(N!=0){
            int rem=N%2;
            str.append(rem);
            N/=2;
        }

        System.out.print(str.reverse());
    }

}
