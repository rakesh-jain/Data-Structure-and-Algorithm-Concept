package com.datastructure.java.arrays;

import java.util.Arrays;

public class UniquePath {
    public static void main(String[] args) {
        System.out.println(uniquePaths(23,12));
    }
    public  static int uniquePaths(int m, int n) {
//        int res=1;
//        int p=(m+n-2);
//        int c=n-1;
//        for(int i=1;i<=(p-c);i++){
//            res=res*(p-c+i)/i;
//        }
//        System.out.println(res);
//       return helper(m,n,0,0, new int[m][n]);
        int[] aboveRow = new int[n];
        Arrays.fill(aboveRow, 1);

        for (int row = 1; row < m; row++) {
            int[] currentRow = new int[n];
            Arrays.fill(currentRow, 1);
            for (int col = 1; col < n; col++) {
                currentRow[col] = currentRow[col - 1] + aboveRow[col];
            }
            aboveRow = currentRow;
        }

        return aboveRow[n - 1];
    }
    private static  int helper(int m, int n, int down, int right, int[][] arr){
        if(down>=m || right>=n){
            return 0;
        }else if (down==m-1 && right==n-1) {
            return 1;
        }
        if(arr[down][right]!=0) return arr[down][right];
        return helper(m, n,  down+1, right,arr) +helper( m, n, down, right+1, arr);
    }

}
