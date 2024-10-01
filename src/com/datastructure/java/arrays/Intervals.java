package com.datastructure.java.arrays;


import java.util.*;
public class Intervals {
    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1,3},{2,6},{9,11},{2,4},{16,17},{8,10},{15,18}};
        int [] add={2,3};
        //int [][] arr=new int[intervals.length+1][intervals[0].length];
        int [][] bee= insert(intervals,add);

       //merger1(intervals);
        for(int[] i :bee){
           for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<List<Integer>> ans =new ArrayList<>();

        for(int i=0;i<intervals.length;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            if(!ans.isEmpty() && end<=ans.get(ans.size()-1).get(1)){
                continue;
            }
            for(int j=i+1;j<intervals.length;j++){
                if(intervals[j][0]<=end){
                    end=Math.max(end,intervals[j][1]);
                }else{
                    break;
                }
            }
            ans.add(Arrays.asList(start,end));
        }
        int[][] arr=new int[ans.size()][ans.get(0).size()];
        convert(ans,arr);
        return arr;

    }
    public static void convert( List<List<Integer>>ans,int[][] arr){
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                arr[i][j]=ans.get(i).get(j);
            }
        }
    }
    static void merger1(int arr[][]){
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        List<List<Integer>> ans =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
            else {
                ans.get(ans.size() - 1).set(1,
                        Math.max(
                                ans.get(ans.size() - 1).get(1),
                                arr[i][1]
                        )
                );
            }
        }
    }
    private static int[][] adds( int[][] intervals,int [] add,int [][] arr ){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i<intervals.length){
                    arr[i][j]=intervals[i][j];
                }else{
                    arr[i][j]=add[j];
                }
            }
        }
        return arr;
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
      int [][] arr=new int[intervals.length+1][intervals[0].length];
      int[][] mainarray=adds(intervals,newInterval,arr);
        Arrays.sort(mainarray, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        List<List<Integer>> ans =new ArrayList<>();
        for (int i = 0; i < mainarray.length; i++) {

            if (ans.isEmpty() || mainarray[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(mainarray[i][0], mainarray[i][1]));
            }
            else {
                ans.get(ans.size() - 1).set(1,
                        Math.max(
                                ans.get(ans.size() - 1).get(1),
                                mainarray[i][1]
                        )
                );
            }
        }
        int[][] l=new int[ans.size()][ans.get(0).size()];
        convert(ans,l);
        return l;
    }
}
