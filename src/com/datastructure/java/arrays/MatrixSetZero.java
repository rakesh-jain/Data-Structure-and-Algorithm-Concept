package com.datastructure.java.arrays;

//https://leetcode.com/problems/set-matrix-zeroes/

import java.util.Arrays;

public class MatrixSetZero {
    public static void main(String[] args) {
        int [][] matrix=new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
       setZeros(matrix);
        for(int []i:matrix){
            for (int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void setZeros(int[][] matrix) {
     for(int i=0;i< matrix.length;i++){
         for(int j=0;j<matrix[i].length;j++){
             if(matrix[i][j]==0){
                 row(matrix,i);
                 col(matrix,j);
             }
         }
     }
    }
    private static void row(int matrix[][],int r){
        for(int i=0;i<matrix.length;i++){
                matrix[r][i]=-1;
        }
    }

    private static void col(int matrix[][],int c){
        for(int i=0;i<matrix.length;i++){
                matrix[i][c] = -1;
        }
    }

    //approach
    private static void setZero1(int[][] matrix){
        int[] ro =new int[matrix.length];
        int[] co =new int[matrix[0].length];
        for (int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix[0].length;j++){
                if(matrix[i][j]==0){
                    ro[i]=1;
                    co[j]=1;
                }
            }
        }
        for(int r=0;r<matrix.length;r++){
            for(int c=0;c< matrix[0].length;c++){
                if(ro[r]==1 || co[c]==1){
                    matrix[r][c]=0;
                }
            }
        }
    }

}
