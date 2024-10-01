package com.datastructure.java.recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursionExamples {
    private static int sum=0;
    public static void main(String[] args) {
        //message();
        //print(1);
        //System.out.println( fibonacci(7));

//        for(int i=0;i<6;i++){
//            System.out.print(fibonacci(i)+" ");
//        }
        //print n to 1
        //fundisplay(5);
       // System.out.println(factorial(5));
        //System.out.println(sumOfDigit(1342));
       // reverse(1234);
        //System.out.println(sum);
       // System.out.println(reverse1(1234));
       // System.out.println(countzeros(30321));
       // System.out.println(selfDividingNumbers(1,22));
        int[] arr=new int[]{1,2,3,4,5,6};
      // printArray(arr);
        //reverseArray(arr,0, arr.length-1);
        reverserc(arr);
        printArray(arr);
    }
    public static int[] reverserc(int arr[]){
        int i=0;
        return helperr(arr, 0);
    }

    private static int[] helperr(int arr[],int start){
        if(start>=arr.length/2){
            return arr;
        }
        swap(arr,start,arr.length-start-1);
        return helperr(arr,start+1);
    }

    public static void reverseArray(int arr[], int start, int end){
        if(start==end){
            return;
        }
        swap(arr,start,end);
        reverseArray(arr, start+1,end-1);
    }
    public static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void printArray(int arr[]){
        for(int s:arr){
            System.out.println(s);
        }
    }
    public static void print(int n){
        if(n>=5){
            System.out.println(n);
            return;
        }
        print(n+1);
        System.out.println(n);

    }

    static void message(){
        message1();
        System.out.println("message");
    }
    static void message1(){
        System.out.println("message1");
        message2();
    }
    static void message2(){
        System.out.println("message2");
        message3();
    }
    static void message3(){
        System.out.println("message3");
    }
    public static int fibonacci(int n){

        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void fundisplay(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
      //  System.out.println(n);
        fundisplay(n-1);
        System.out.println(n);
    }
    public static int factorial(int n){
        if(n==1){
            return n;
        }
        return n*factorial(n-1);
    }
    private static int sumOfDigit(int num){
        if(num==0){
            return num;
        }
       return num%10+sumOfDigit(num/10);
    }
    public static void reverse(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        reverse(n/10);
    }
    public static int reverse1(int n){
        int digitcount=(int)Math.log10(n)+1;
        return helper(n,digitcount);
    }
    public static int helper(int n,int digitcount){
        if(n%10==n){
            return n;
        }
        return (int) ((int)(n%10)*Math.pow(10,digitcount-1)+helper(n/10,digitcount-1));
    }
    private static int countzeros(int n){
        return helperzeros(n,0);
    }
    private static int helperzeros(int n,int count){
        if(n==0){
            return count;
        }
        if((n%10)==0){
            return helperzeros(n/10,count+1);
        }
        return helperzeros(n/10,count);

    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=left;i<=right;i++){
            if(helper(i,(long)i)){
                list.add(i);
            }
        }
        return list;
    }
    private static boolean helper(int n,long digit){
        if(digit==0){
            return true;
        }
        int rem= (int) (digit%10);
        if(rem==0){
            return false;
        }
       // if(rem>0) {
            if ((n % rem) != 0 && rem>0 ) {
                return false;
            }
       // }
        return  helper(n,digit/10);
    }
}
