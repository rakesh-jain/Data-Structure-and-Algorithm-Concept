package com.datastructure.java.arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int [][]arr=new int[][]{{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
//        int [][]mat= rotate(arr);
//        assign(arr,mat);
        rotate1(arr);
      for (int [] s:arr){
          for(int i:s){
              System.out.print(i+"  ");
          }
          System.out.println();
      }
    }
    public static int[][] rotate(int[][] matrix) {
      int [] [] arr=new int[matrix.length][matrix[0].length];
      for(int row=0;row< matrix.length;row++){
          for(int col=0;col<matrix[row].length;col++){
           arr[col][matrix.length-row-1]=matrix[row][col];
          }
      }
      return arr;
    }
   private static void assign(int [][]matrix,int [][] ans){
       for(int row=0;row< ans.length;row++) {
           for (int col = 0; col < ans[row].length; col++) {
            matrix[row][col]=ans[row][col];
           }
       }
   }
   static void rotate1(int[][] matrix) {
     for(int i=0;i< matrix.length-1;i++){
         for(int j=i+1;j< matrix.length;j++){
             swap(i,j,matrix);
             System.out.print(matrix[i][j]+" ");
         }

         System.out.println();
     }
   }
   static void swap(int i,int j,int [][]s){
        int temp=s[i][j];
       s[i][j]=s[j][i];
       s[j][i]=temp;
   }
   public static void reverse(int arr[][]){
        for(int i=0;i<arr.length;i++){
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                swap(start,end,arr);
            }
        }
   }

//     public void rotate(int[][] matrix) {
//     int [] [] arr=new int[matrix.length][matrix[0].length];
//       for(int row=0;row< matrix.length;row++){
//           for(int col=0;col<matrix[row].length;col++){
//            arr[col][matrix.length-row-1]=matrix[row][col];
//           }
//       }
//       assign(matrix,arr);
//     }
//      public  void assign(int [][]matrix,int [][] ans){
//        for(int row=0;row< ans.length;row++) {
//            for (int col = 0; col < ans[row].length; col++) {
//             matrix[row][col]=ans[row][col];
//            }
//        }
//    }
}