package com.datastructure.java.recursion;


public class Basic {
    public static void main(String[] args) {
        pattern(5);
    }
   public static void pattern(int n){
        for(int row=0;row<n*2;row++) {
            int content=(row>(n*2/2))?row+1-n:n-row;
            int space=(row>(n*2/2))?n-content:row;
            if(row==(n*2/2)){
                content=1;
                space=n-content;
            }
            for(int s=0;s<space;s++){
                System.out.print(" ");
            }
            for(int col=0;col<content;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

   }
}
